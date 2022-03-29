// index.js
// 获取应用实例
const app = getApp()
let msg;   //存储输入的内容
Page({
  data: {
    motto: 'Hello World',
    userInfo: {},
    hasUserInfo: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo'),
    canIUseGetUserProfile: false,
    canIUseOpenData: wx.canIUse('open-data.type.userAvatarUrl') && wx.canIUse('open-data.type.userNickName'), // 如需尝试获取用户信息可改为false
    focus: false,
    inputValue: '',
    showActionsheet:true,
    groups: [
      {name:'登录其他账号',id:1},
      {name:'注册',id:2},
      {name:'微信安全中心',id:3},
    ],
    loginList:[],
    registerCell:'',
    registerPass:''
  },

  // 获取用户名的值并将值赋给最先定义的初始化变量
  inpt_tel:function(e){
    this.setData({
      registerCell: e.detail.value
    })
  },
  inpt_pass:function(e){
    this.setData({
      registerPass: e.detail.value
    })
  },

  bindSure:function(e){
    var that = this;
    console.log(that.data)
    wx.request({
      url: 'http://192.168.43.91:8080/wechatroom/register/loginForm',
      method:'POST',
      header: {
        'Content-Type': 'application/x-www-form-urlencoded'
        // 'content-type': 'application/json' // 默认值
      },  
      data:{
        'registerCell': that.data.registerCell,
        'registerPass': that.data.registerPass
      },
      success:function(res){
        var loginList = res.data;
        that.setData({
          loginList:loginList,
        })
        if (loginList != false) {
          wx.showToast({    //这是微信小程序里面自带的成功弹窗
            title: '登录成功',  //弹窗里面的内容
            icon: 'success',  //图标
            duration: 2000,   //弹窗延迟的时间
            success: function () {
              wx.switchTab({
                //保留当前页面，跳转到应用内的某个页面
                url: '../../login/message/message',   //跳转的页面
              })
            }
          })
        } else {
          wx.showToast({
            title: '登录失败',
            icon: 'none',
            duration: 2000,
          })
        }
      }
    })
  },

  bindHideKeyboard: function (e) {
    if (e.detail.value === '123') {
      // 收起键盘
      wx.hideKeyboard()
    }
  },
  // 事件处理函数
  bindViewTap() {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  onLoad() {
    if (wx.getUserProfile) {
      this.setData({
        canIUseGetUserProfile: true
      })
    }
    console.log('onLoad')
  },
  getUserProfile(e) {
    // 推荐使用wx.getUserProfile获取用户信息，开发者每次通过该接口获取用户个人信息均需用户确认，开发者妥善保管用户快速填写的头像昵称，避免重复弹窗
    wx.getUserProfile({
      desc: '展示用户信息', // 声明获取用户个人信息后的用途，后续会展示在弹窗中，请谨慎填写
      success: (res) => {
        console.log(res)
        this.setData({
          userInfo: res.userInfo,
          hasUserInfo: true
        })
      }
    })
  },
  getUserInfo(e) {
    // 不推荐使用getUserInfo获取用户信息，预计自2021年4月13日起，getUserInfo将不再弹出弹窗，并直接返回匿名的用户个人信息
    console.log(e)
    this.setData({
      userInfo: e.detail.userInfo,
      hasUserInfo: true
    })
  },

  bindFindpass(e){
    wx.navigateTo({
      url: '../findpass/findpass',
    })
  },

  bindMore:function(){
    console.log("-------------已点击按钮-------------");
     this.setData({showActionsheet:false});
  },
  actionsheetChange:function(){
    console.log("------------点击“取消” 或 “背景蒙层”----------------");
    this.setData({showActionsheet:true});
  },
  itemTap:function(even){
    var id = even.target.dataset.id;
    console.log(id)
    if(id == 2){
      wx.navigateTo({
        url: '../index/register/register',
      })
    }
  }
})

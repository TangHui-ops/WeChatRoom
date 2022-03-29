let msg;   //存储输入的内容

Page({
  data:{
    radioCheck:false,
    registerPhoto: '',
    // disabled: true,
    registerNickname: '',
    registerState: '',
    registerCell: '',
    registerPass: '',
    registerPhoto: ''
  },

  // 获取用户名的值并将值赋给最先定义的初始化变量
  inputName:function(e){   //昵称
    this.setData({
      registerNickname: e.detail.value
    })
  },
  inputState:function(e){  //国家、地区
    this.setData({
      registerState: e.detail.value
    })
  },
  inputCell:function(e){   //手机号
    this.setData({
      registerCell: e.detail.value
    })
  },
  inptPass:function(e){    //密码
    this.setData({
      registerPass: e.detail.value
    })
  },

  // 选择图片
  gotoShow: function(){var _this = this
    var _this = this
        wx.chooseImage({
          count: 1, // 最多可以选择的图片张数，默认9
          sizeType: ['original', 'compressed'], // original 原图，compressed 压缩图，默认二者都有
          sourceType: ['album', 'camera'], // album 从相册选图，camera 使用相机，默认二者都有
          success: function(res){
            // console.log(res)
            _this.setData({
              registerPhoto:res.tempFilePaths
            })
          },
          fail: function() {
            // fail
          },
          complete: function() {
            // complete
          }    
    })
  },

  bindSure:function(e){
    var that = this;
    var registerPhoto = that.data.registerPhoto;
    var li = registerPhoto.join(',');
    var registerNickname = that.data.registerNickname;
    var registerState = that.data.registerState;
    var registerCell = that.data.registerCell;
    var registerPass = that.data.registerPass;
    console.log(e)
    console.log(that.data)
    wx.request({
      url: 'http://192.168.43.91:8080/wechatroom/register/addregister',
      method:'POST',
      header: {
        'Content-Type': 'application/json;charset=UTF-8',
      },  
      data:{
        registerPhoto: li,
        registerNickname: registerNickname,
        registerState: registerState,
        registerCell: registerCell,
        registerPass: registerPass
      },
      success:function(res){
        // console.log(res.data)
        if(registerNickname == '' || registerCell == '' || registerPass == ''){
          wx.showToast({
            title: '信息不完整',
            icon:"none",
            duration:3000,
          })
        }else{
          wx.showToast({
            title: '注册成功',
            icon:"success",
            duration:3000,
            success: function () {
              wx.redirectTo({
                url: '../index',
              })
            }
          });
        } 
      }
    })
  },

  radioClick:function(event){
    var radioCheck = this.data.radioCheck;
    this.setData({ "radioCheck": !radioCheck});
  },

  
})
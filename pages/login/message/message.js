// pages/message/message.js

const app = getApp()

Page({

  /**
   * 页面的初始数据
   */
  data: {
    messagelist:[],
  },

  /* 生命周期函数--监听页面加载*/
  onLoad(options) {
    var that=this;
    wx.request({
      url: 'http://192.168.43.91:8080/wechatroom/messagelist/messageLists',
      method:'GET',
      data:{},
      success:function(res){
        var messagelist=res.data;
        if(messagelist==null){
          var toastText='获取数据失败';
          wx.showToast({
            title: toastText,
            icon:'',
            duration:2000 //弹出时间
          })
        }else{
          that.setData({
            messagelist:messagelist
          })
        }
      }
    })
  },

  handleDetail(e){
    var messageListId = e.currentTarget.dataset.messagelistid;
    console.log(messageListId)
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady() {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage() {

  }
})
CREATE DATABASE wechatroom;

SELECT * FROM login;

-- 登录表
CREATE TABLE login
(
    id INT PRIMARY KEY AUTO_INCREMENT,   #编号
    cellphone INTEGER NOT NULL,    #手机号码
    PASSWORD VARCHAR(12) NOT NULL,        #密码 
    verif INT(8)         #短信验证
);
INSERT INTO login(cellphone,PASSWORD) VALUES
  (12345672346,'th123'),(78563765289,'yg26735'),
  (87653672678,'tyg65665');
INSERT INTO login(cellphone,PASSWORD) VALUES(173734957,'th123')
  
#创建消息列表
CREATE TABLE message_list(
message_list_id	INT PRIMARY KEY AUTO_INCREMENT COMMENT'消息ID',
message_headline  NVARCHAR(50)	NOT NULL COMMENT'标题',
message_content	NVARCHAR(500)	NOT NULL COMMENT'内容',
message_st	DATETIME	NOT NULL COMMENT'时间',
message_pattern NVARCHAR(500) COMMENT'头像',
message_icon NVARCHAR(256) COMMENT'静音'
)COMMENT='消息列表';
INSERT INTO message_list VALUES(1,'腾讯新闻','广西夫妻21年时间生下15个孩子，4男11女，官方通报来了',NOW(),
  'https://image.so.com/view?src=imageonebox&q=%E5%9B%BE%E7%89%87&obx_type=360pic_new_strong&correct=%E5%9B%BE%E7%89%87&ancestor=list&cmsid=d2f8c96a22b58d8ba334c7cc84094338&cmras=6&cn=0&gn=0&kn=41&crn=0&bxn=0&fsn=101&cuben=0&pornn=0&manun=24&adstar=0&clw=270#
   id=43c320e91594082691d564cdccd2d5c7&currsn=0&ps=101&pc=101',NULL)
INSERT INTO message_list VALUES(2,'狐朋狗友','出来浪啊',NOW(),
  'https://www.163.com/dy/article/H2AMPUB205188C7T.html',NULL)
INSERT INTO message_list VALUES(3,'腾讯新闻','广西夫妻21年时间生下15个孩子，4男11女，官方通报来了',NOW(),
  'https://image.so.com/view?src=imageonebox&q=%E5%9B%BE%E7%89%87&obx_type=360pic_new_strong&correct=%E5%9B%BE%E7%89%87&ancestor=list&cmsid=d2f8c96a22b58d8ba334c7cc84094338&cmras=6&cn=0&gn=0&kn=41&crn=0&bxn=0&fsn=101&cuben=0&pornn=0&manun=24&adstar=0&clw=270#
   id=43c320e91594082691d564cdccd2d5c7&currsn=0&ps=101&pc=101',NULL)--

-- 注册表
CREATE TABLE register(
register_id	INT PRIMARY KEY AUTO_INCREMENT COMMENT'注册用户ID',
register_photo NVARCHAR(500) COMMENT'头像',
register_nickname  NVARCHAR(20)	NOT NULL COMMENT'昵称',
register_state	NVARCHAR(500)	NOT NULL COMMENT'国家',
register_cell	INTEGER	NOT NULL COMMENT'手机号',
register_pass VARCHAR(12) NOT NULL COMMENT'密码'
)COMMENT='注册用户表';












/*
Navicat MySQL Data Transfer

Source Server         : 10.200.mark
Source Server Version : 50719
Source Host           : 10.10.10.200:3306
Source Database       : mark

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-05-22 10:03:09
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `image` varchar(100) NOT NULL,
  `description` varchar(800) NOT NULL,
  `price` decimal(10,2) unsigned zerofill DEFAULT NULL COMMENT '定价',
  `category` varchar(100) NOT NULL,
  `created_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `index_name` (`name`) USING BTREE,
  KEY `index_category` (`category`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=294 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '商战：电商时代', 'http://bjkjjggysfook.markwuwei.com/shangzhanshidai.jpg', '商战：电商时代（吴晓波撰稿，CCTV财经频道年度巨献《商战之电商风云》同名图书，马云、柳传志、刘强东、李国庆、雷军等电商巨子首次同台、深度解读：要么电商，要么死！）', '00000051.00', 'IT互联网', '2014-05-21 21:21:18');
INSERT INTO `book` VALUES ('2', 'HTML5与CSS3设计模式', 'http://bjkjjggysfook.markwuwei.com/22938400-1_w_1.jpg', 'HTML5与CSS3设计模式【350个即时可用的模式 结合了HTML5与CSS3的最新内容和技巧】', '00000089.00', '前端开发', '2014-05-21 21:22:07');
INSERT INTO `book` VALUES ('3', 'HTML 5与CSS 3权威指南', 'http://bjkjjggysfook.markwuwei.com/23200994-1_w_1.jpg', 'HTML 5与CSS 3权威指南（第2版 下册）（标杆之作，第1版累计印刷10余次，销量超50000册，4大网店评论超过4600条，被誉为“系统学习HTML 5与CSS 3技术的最佳指导参考书之一”）', '00000059.00', '前端开发', '2014-05-21 21:22:54');
INSERT INTO `book` VALUES ('4', 'JavaScript设计模式', 'http://bjkjjggysfook.markwuwei.com/23266635-1_w_1.jpg', 'JavaScript设计模式', '00000049.00', '前端开发', '2014-05-21 21:25:34');
INSERT INTO `book` VALUES ('7', '互联网思维—商业颠覆与重构', 'http://bjkjjggysfook.markwuwei.com/23412123-1_w_1.jpg', '互联网思维—商业颠覆与重构（第1本系统化阐述互联网思维的力作！深度揭秘12大核心互联网思维！瞬间掌握互联网思维精髓！即刻改变未来=一本可以影响个人与企业命运的著作！）', '00000049.00', 'IT互联网', '2014-05-21 22:58:21');
INSERT INTO `book` VALUES ('8', '麦肯锡方法', 'http://bjkjjggysfook.markwuwei.com/20770117-1_w_2.jpg', '麦肯锡方法（经管图书的常青树，外企员工入职必读图书，麦肯锡专家经典著作：从五大方面揭示了麦肯锡工作的小窍门）', '00000030.00', '心智成熟之旅', '2014-05-21 22:59:35');
INSERT INTO `book` VALUES ('9', '你在为谁工作', 'http://bjkjjggysfook.markwuwei.com/8960640-1_w_1.jpg', '你在为谁工作（在当今这个浮躁的年代，我们需要用什么去重新点燃工作激情？销量超过百万册，世界500强企业推崇的优秀员工思维理念）', '00000016.80', '心智成熟之旅', '2014-05-21 23:00:22');
INSERT INTO `book` VALUES ('12', '麦肯锡意识', 'http://bjkjjggysfook.markwuwei.com/20770118-1_w_2.jpg', '麦肯锡意识（经管图书的常青树，外企员工入职必读图书，麦肯锡专家经典著作：书中有大量的案例分析，并有实战练习的小贴士，是一本不可多得的修正自我职业管理的案头书。）', '00000035.00', '心智成熟之旅', '2014-05-21 23:07:07');
INSERT INTO `book` VALUES ('13', '麦肯锡传奇', 'http://bjkjjggysfook.markwuwei.com/20848388-1_w_2.jpg', '麦肯锡传奇（经管图书的常青树，外企员工入职必读图书，麦肯锡专家经典著作）（现代管理咨询之父：马文的传奇人生）', '00000039.00', '心智成熟之旅', '2014-05-21 23:07:57');
INSERT INTO `book` VALUES ('14', '别让不好意思害了你', 'http://bjkjjggysfook.markwuwei.com/23286888-1_w_1.jpg', '别让不好意思害了你（升级版）:《别让不好意思害了你》狂销10万册之后，继续推出《别让不好意思害了你（升级版）》', '00000029.80', '心智成熟之旅', '2014-05-21 23:09:31');
INSERT INTO `book` VALUES ('15', '罗辑思维', 'http://bjkjjggysfook.markwuwei.com/23343429-1_w_4.jpg', '罗辑思维:有种，有趣，有料（当当独家附赠《罗辑思维》视频内容策划稿。腾讯董事局主席 马化腾说：《罗辑思维》是一张人生船票，通往自由的彼岸。柳传志 王石 马化腾 李开复 徐小平 姬十三等推荐！）', '00000036.00', 'IT互联网', '2014-05-21 23:10:16');
INSERT INTO `book` VALUES ('17', '流量的秘密', 'http://bjkjjggysfook.markwuwei.com/22736929-1_w_1.jpg', '流量的秘密—Google Analytics网站分析与优化技巧(第2版)', '00000059.00', 'IT互联网', '2014-05-21 23:12:20');
INSERT INTO `book` VALUES ('18', 'jQuery UI开发指南', 'http://bjkjjggysfook.markwuwei.com/22910975-1_w_1.jpg', 'jQuery UI开发指南', '00000039.00', '前端开发', '2014-05-21 23:13:08');
INSERT INTO `book` VALUES ('19', '卡耐基心态调理', 'http://bjkjjggysfook.qiniudn.com/20278215-1_w.jpg', '卡耐基说：“一个人的内心的想法是非常重要的。好的想法考虑到原因和结果，可以产生合乎逻辑的。有建设性的计划；而坏的想法通常会民致一个人的心理紧张，甚至精神崩溃。” 卡耐基说：“用什么样的观念看世界，世界就是什么样子，心态就是什么样子。因此，希望调理心态，首先需要调和观念。”', '00000025.00', '心智成熟之旅', '2014-09-21 17:11:59');
INSERT INTO `book` VALUES ('20', '高效能人士的七个习惯（20周年纪念版）', 'http://bjkjjggysfook.qiniudn.com/23178387-1_b.jpg', '被美国学界誉为“思想巨匠”和“最具前瞻性的管理思想家”的史蒂芬?柯维博士，他的集大成之作《高效能人士的七个习惯》已成为中国企事业单位和政府机关必备的最经典、最著名的一部培训教材；在美国乃至全世界', '00000049.00', '心智成熟之旅', '2014-09-21 17:13:35');


-- ----------------------------
-- Table structure for `sample`
-- ----------------------------
DROP TABLE IF EXISTS `sample`;
CREATE TABLE `sample` (
  `id` int(5) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `name` varchar(100) NOT NULL COMMENT '名称',
  `icon` varchar(50) NOT NULL COMMENT '图标',
  `style` varchar(50) DEFAULT NULL COMMENT '样式',
  `category` varchar(50) NOT NULL COMMENT '分类',
  `description` tinytext COMMENT '描述',
  `detail_link` varchar(255) DEFAULT NULL COMMENT '详细地址相对路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='sample';

-- ----------------------------
-- Records of sample
-- ----------------------------
INSERT INTO `sample` VALUES ('1', 'CSS时钟', 'icon-clock', 'bounceInLeft', 'CSS-EFFECT', 'CSS 样式绘制钟表盘 js实现时间变化', 'detail/css-clock');
INSERT INTO `sample` VALUES ('2', 'CSS美国国旗', 'icon-us', 'bounceInLeft', 'CSS-EFFECT', 'CSS线性渐变和背景图制作美国国旗', 'detail/css-us-flag');
INSERT INTO `sample` VALUES ('3', 'CSS五边形', 'icon-wubianxing', 'bounceInRight', 'CSS-EFFECT', 'CSS五边形图片展示', 'detail/css-wubianxing');
INSERT INTO `sample` VALUES ('4', 'CSS六边形', 'icon-liubianxing', 'bounceInRight', 'CSS-EFFECT', 'CSS六边形图片展示', 'detail/css-liubianxing');
INSERT INTO `sample` VALUES ('5', 'DROPZONE', 'icon-drag', 'rotateInDownLeft', 'THIRD-PARTY-PLUGINS', 'DROPZONE 拖拽、预览图片上传', 'detail/third/dropzone');
INSERT INTO `sample` VALUES ('6', 'ICONFONT', 'icon-font', 'slideInUp', 'THIRD-PARTY-PLUGINS', '字体图标', 'detail/third/iconfont');
INSERT INTO `sample` VALUES ('7', 'JQUERY-CONFIRM', 'icon-popup', 'rotateInDownRight', 'THIRD-PARTY-PLUGINS', 'Jquery弹出层', 'detail/third/jqueryconfirm');
INSERT INTO `sample` VALUES ('8', 'FULLCALENDAR', 'icon-calendar', null, 'THIRD-PARTY-PLUGINS', '日历', 'detail/third/fullcalendar');
INSERT INTO `sample` VALUES ('9', 'ICHECK', 'icon-xuanzhong', null, 'THIRD-PARTY-PLUGINS', '单选、复选按钮美化插件', 'detail/third/icheck');
INSERT INTO `sample` VALUES ('10', 'MOMENT', 'icon-time', null, 'THIRD-PARTY-PLUGINS', '时间格式化工具', 'detail/third/moment');
INSERT INTO `sample` VALUES ('11', 'HIGHLIGHT', 'icon-highlight', null, 'THIRD-PARTY-PLUGINS', '代码高亮插件', 'detail/third/highlight');
INSERT INTO `sample` VALUES ('12', 'UEDITOR', 'icon-editor', null, 'THIRD-PARTY-PLUGINS', '百度富文本编辑器', 'detail/third/ueditor');
INSERT INTO `sample` VALUES ('13', 'NOTY', 'icon-tongzhi', null, 'THIRD-PARTY-PLUGINS', '通知插件', 'detail/third/noty');
INSERT INTO `sample` VALUES ('14', 'idate', 'icon-idate', 'plugin-idate bounceInLeft', 'DIY-PLUGINS', '时间选择插件', 'detail/diy/idate');
INSERT INTO `sample` VALUES ('15', 'idatescope', 'icon-idatescope', 'plugin-idatescope slideInUp', 'DIY-PLUGINS', '时间区间选择插件', 'detail/diy/idatescope');
INSERT INTO `sample` VALUES ('16', 'image preview', 'icon-imgpreview', 'plugin-imgpreview bounceInRight', 'DIY-PLUGINS', '图片预览插件', 'detail/diy/imgpreview');
INSERT INTO `sample` VALUES ('17', 'multiple select', 'icon-multipleselect', 'plugin-multipleselect rotateInDownRight', 'DIY-PLUGINS', '多选插件', 'detail/diy/multipleselect');

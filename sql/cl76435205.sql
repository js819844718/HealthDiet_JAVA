-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: cl76435205
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `cl76435205`
--

/*!40000 DROP DATABASE IF EXISTS `cl76435205`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `cl76435205` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `cl76435205`;

--
-- Table structure for table `canyinxinxi`
--

DROP TABLE IF EXISTS `canyinxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `canyinxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `caipinmingcheng` varchar(200) NOT NULL COMMENT '菜品名称',
  `caipintupian` longtext NOT NULL COMMENT '菜品图片',
  `caipinfenlei` varchar(200) DEFAULT NULL COMMENT '菜品分类',
  `yingyangjibie` varchar(200) DEFAULT NULL COMMENT '营养级别',
  `tuijianzhishu` varchar(200) DEFAULT NULL COMMENT '推荐指数',
  `caipinjianjie` longtext COMMENT '菜品简介',
  `storeupnum` int(11) DEFAULT NULL COMMENT '收藏数量',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='餐饮信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `canyinxinxi`
--

LOCK TABLES `canyinxinxi` WRITE;
/*!40000 ALTER TABLE `canyinxinxi` DISABLE KEYS */;
INSERT INTO `canyinxinxi` VALUES (61,'2024-03-30 14:49:02','菜品名称1','file/canyinxinxiCaipintupian1.jpg,file/canyinxinxiCaipintupian2.jpg,file/canyinxinxiCaipintupian3.jpg','菜品分类1','营养级别1','五星','菜品简介1',1,'2024-03-30 22:49:02'),(62,'2024-03-30 14:49:02','菜品名称2','file/canyinxinxiCaipintupian2.jpg,file/canyinxinxiCaipintupian3.jpg,file/canyinxinxiCaipintupian4.jpg','菜品分类2','营养级别2','五星','菜品简介2',2,'2024-03-30 22:49:02'),(63,'2024-03-30 14:49:02','菜品名称3','file/canyinxinxiCaipintupian3.jpg,file/canyinxinxiCaipintupian4.jpg,file/canyinxinxiCaipintupian5.jpg','菜品分类3','营养级别3','五星','菜品简介3',3,'2024-03-30 22:49:02'),(64,'2024-03-30 14:49:02','菜品名称4','file/canyinxinxiCaipintupian4.jpg,file/canyinxinxiCaipintupian5.jpg,file/canyinxinxiCaipintupian6.jpg','菜品分类4','营养级别4','五星','菜品简介4',4,'2024-03-30 22:49:02'),(65,'2024-03-30 14:49:02','菜品名称5','file/canyinxinxiCaipintupian5.jpg,file/canyinxinxiCaipintupian6.jpg,file/canyinxinxiCaipintupian7.jpg','菜品分类5','营养级别5','五星','菜品简介5',5,'2024-03-30 22:49:02'),(66,'2024-03-30 14:49:02','菜品名称6','file/canyinxinxiCaipintupian6.jpg,file/canyinxinxiCaipintupian7.jpg,file/canyinxinxiCaipintupian8.jpg','菜品分类6','营养级别6','五星','菜品简介6',6,'2024-03-30 22:49:02');
/*!40000 ALTER TABLE `canyinxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `canyinyingyang`
--

DROP TABLE IF EXISTS `canyinyingyang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `canyinyingyang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `caipinmingcheng` varchar(200) NOT NULL COMMENT '菜品名称',
  `caipinfenlei` varchar(200) NOT NULL COMMENT '菜品分类',
  `tupian` longtext COMMENT '图片',
  `kaluli` double DEFAULT NULL COMMENT '卡路里(cal)',
  `tanshui` double DEFAULT NULL COMMENT '碳水(100g)',
  `danbaizhi` double DEFAULT NULL COMMENT '蛋白质(100g)',
  `zhifang` double DEFAULT NULL COMMENT '脂肪(100g)',
  `yingyangsu` double DEFAULT NULL COMMENT '营养素(100g)',
  `yingyangjibie` varchar(200) DEFAULT NULL COMMENT '营养级别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='餐饮营养';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `canyinyingyang`
--

LOCK TABLES `canyinyingyang` WRITE;
/*!40000 ALTER TABLE `canyinyingyang` DISABLE KEYS */;
INSERT INTO `canyinyingyang` VALUES (91,'2024-03-30 14:49:02','菜品名称1','菜品分类1','file/canyinyingyangTupian1.jpg,file/canyinyingyangTupian2.jpg,file/canyinyingyangTupian3.jpg',1,1,1,1,1,'营养级别1'),(92,'2024-03-30 14:49:02','菜品名称2','菜品分类2','file/canyinyingyangTupian2.jpg,file/canyinyingyangTupian3.jpg,file/canyinyingyangTupian4.jpg',2,2,2,2,2,'营养级别2'),(93,'2024-03-30 14:49:02','菜品名称3','菜品分类3','file/canyinyingyangTupian3.jpg,file/canyinyingyangTupian4.jpg,file/canyinyingyangTupian5.jpg',3,3,3,3,3,'营养级别3'),(94,'2024-03-30 14:49:02','菜品名称4','菜品分类4','file/canyinyingyangTupian4.jpg,file/canyinyingyangTupian5.jpg,file/canyinyingyangTupian6.jpg',4,4,4,4,4,'营养级别4'),(95,'2024-03-30 14:49:02','菜品名称5','菜品分类5','file/canyinyingyangTupian5.jpg,file/canyinyingyangTupian6.jpg,file/canyinyingyangTupian7.jpg',5,5,5,5,5,'营养级别5'),(96,'2024-03-30 14:49:02','菜品名称6','菜品分类6','file/canyinyingyangTupian6.jpg,file/canyinyingyangTupian7.jpg,file/canyinyingyangTupian8.jpg',6,6,6,6,6,'营养级别6');
/*!40000 ALTER TABLE `canyinyingyang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'swiper1','file/swiperPicture1.jpg'),(2,'swiper2','file/swiperPicture2.jpg'),(3,'swiper3','file/swiperPicture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusscanyinxinxi`
--

DROP TABLE IF EXISTS `discusscanyinxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusscanyinxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COMMENT '头像',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='餐饮信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusscanyinxinxi`
--

LOCK TABLES `discusscanyinxinxi` WRITE;
/*!40000 ALTER TABLE `discusscanyinxinxi` DISABLE KEYS */;
/*!40000 ALTER TABLE `discusscanyinxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiankangshuju`
--

DROP TABLE IF EXISTS `jiankangshuju`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiankangshuju` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `yonghuming` varchar(200) NOT NULL COMMENT '用户名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `shengao` varchar(200) NOT NULL COMMENT '身高',
  `tizhong` varchar(200) NOT NULL COMMENT '体重',
  `xuetang` varchar(200) DEFAULT NULL COMMENT '血糖',
  `xinlv` varchar(200) DEFAULT NULL COMMENT '心率',
  `xueya` varchar(200) DEFAULT NULL COMMENT '血压',
  `danguchun` varchar(200) DEFAULT NULL COMMENT '胆固醇',
  `guominshiwu` varchar(200) DEFAULT NULL COMMENT '过敏食物',
  `jibingshi` longtext COMMENT '疾病史',
  `jiluriqi` date DEFAULT NULL COMMENT '记录日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='健康数据';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiankangshuju`
--

LOCK TABLES `jiankangshuju` WRITE;
/*!40000 ALTER TABLE `jiankangshuju` DISABLE KEYS */;
INSERT INTO `jiankangshuju` VALUES (81,'2024-03-30 14:49:02','用户账号1','用户名1','性别1','年龄1','身高1','体重1','血糖1','心率1','血压1','胆固醇1','过敏食物1','疾病史1','2024-03-30'),(82,'2024-03-30 14:49:02','用户账号2','用户名2','性别2','年龄2','身高2','体重2','血糖2','心率2','血压2','胆固醇2','过敏食物2','疾病史2','2024-03-30'),(83,'2024-03-30 14:49:02','用户账号3','用户名3','性别3','年龄3','身高3','体重3','血糖3','心率3','血压3','胆固醇3','过敏食物3','疾病史3','2024-03-30'),(84,'2024-03-30 14:49:02','用户账号4','用户名4','性别4','年龄4','身高4','体重4','血糖4','心率4','血压4','胆固醇4','过敏食物4','疾病史4','2024-03-30'),(85,'2024-03-30 14:49:02','用户账号5','用户名5','性别5','年龄5','身高5','体重5','血糖5','心率5','血压5','胆固醇5','过敏食物5','疾病史5','2024-03-30'),(86,'2024-03-30 14:49:02','用户账号6','用户名6','性别6','年龄6','身高6','体重6','血糖6','心率6','血压6','胆固醇6','过敏食物6','疾病史6','2024-03-30');
/*!40000 ALTER TABLE `jiankangshuju` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `menujson` longtext COMMENT '菜单',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='菜单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1,'2024-03-30 14:49:02','[{\"backMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-link\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"轮播图\",\"menuJump\":\"列表\",\"tableName\":\"config\"},{\"appFrontIcon\":\"cuIcon-clothes\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"健康饮食资讯\",\"menuJump\":\"列表\",\"tableName\":\"news\"}],\"fontClass\":\"icon-common33\",\"menu\":\"轮播图管理\",\"unicode\":\"&#xee6a;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-flashlightopen\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"管理员\",\"menuJump\":\"列表\",\"tableName\":\"users\"},{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"用户\",\"menuJump\":\"列表\",\"tableName\":\"yonghu\"}],\"fontClass\":\"icon-common45\",\"menu\":\"管理员管理\",\"unicode\":\"&#xef3b;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-paint\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"营养级别\",\"menuJump\":\"列表\",\"tableName\":\"yingyangjibie\"}],\"fontClass\":\"icon-common35\",\"menu\":\"营养级别\",\"unicode\":\"&#xee8c;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-cardboard\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\",\"查看评论\"],\"menu\":\"餐饮信息\",\"menuJump\":\"列表\",\"tableName\":\"canyinxinxi\"},{\"appFrontIcon\":\"cuIcon-pic\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"餐饮营养\",\"menuJump\":\"列表\",\"tableName\":\"canyinyingyang\"}],\"fontClass\":\"icon-common48\",\"menu\":\"餐饮管理\",\"unicode\":\"&#xef65;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-clothes\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"营养等级标准\",\"menuJump\":\"列表\",\"tableName\":\"yingyangdengjibiaozhun\"}],\"fontClass\":\"icon-common33\",\"menu\":\"营养等级管理\",\"unicode\":\"&#xee6a;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-link\",\"buttons\":[\"查看\",\"删除\"],\"menu\":\"健康数据\",\"menuJump\":\"列表\",\"tableName\":\"jiankangshuju\"}],\"fontClass\":\"icon-common32\",\"menu\":\"健康数据\",\"unicode\":\"&#xee66;\"}],\"frontMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-form\",\"buttons\":[\"查看评论\"],\"menu\":\"餐饮信息\",\"menuJump\":\"列表\",\"tableName\":\"canyinxinxi\"}],\"menu\":\"餐饮推荐\"}],\"hasBackLogin\":\"是\",\"hasBackRegister\":\"否\",\"hasFrontLogin\":\"否\",\"hasFrontRegister\":\"否\",\"roleName\":\"管理员\",\"tableName\":\"users\"},{\"backMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-link\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"健康数据\",\"menuJump\":\"列表\",\"tableName\":\"jiankangshuju\"}],\"fontClass\":\"icon-common32\",\"menu\":\"健康数据\",\"unicode\":\"&#xee66;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-present\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"我的收藏\",\"menuJump\":\"1\",\"tableName\":\"storeup\"}],\"fontClass\":\"icon-common19\",\"menu\":\"我的收藏管理\",\"unicode\":\"&#xee00;\"}],\"frontMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-form\",\"buttons\":[\"查看评论\"],\"menu\":\"餐饮信息\",\"menuJump\":\"列表\",\"tableName\":\"canyinxinxi\"}],\"menu\":\"餐饮推荐\"}],\"hasBackLogin\":\"否\",\"hasBackRegister\":\"否\",\"hasFrontLogin\":\"是\",\"hasFrontRegister\":\"是\",\"roleName\":\"用户\",\"tableName\":\"yonghu\"}]');
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` longtext NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='健康饮食资讯';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (41,'2024-03-30 14:49:02','青花瓷','素胚勾勒出青花笔锋浓转淡，瓶身描绘的牡丹一如你初妆，冉冉檀香透过窗心事我了然，宣上走笔至此搁一半，釉色渲染仕女图韵味被私藏，而你嫣然的一笑如含苞待放，你的美缕飘散，去到我去不了的地方，天青色等烟雨 而我在等你，炊烟袅袅升起','file/newsPicture1.jpg','素胚勾勒出青花笔锋浓转淡，瓶身描绘的牡丹一如你初妆，冉冉檀香透过窗心事我了然，宣上走笔至此搁一半，釉色渲染仕女图韵味被私藏，而你嫣然的一笑如含苞待放，你的美缕飘散，去到我去不了的地方，天青色等烟雨 而我在等你，炊烟袅袅升起， 隔江千万里，在瓶底书前朝的飘逸，就当我为遇见你伏笔，天青色等烟雨， 而我在等你，月色被打捞起， 晕开了局，如传世的青花瓷自顾自美丽，你眼带笑意，色白花青的锦鲤跃然于碗底，临摹宋体落款时却惦记着你，你隐藏在窑烧里千年的秘密，极细腻犹如绣花针落地，帘外芭蕉惹骤雨门环惹铜绿，而我路过那江南小镇惹了你，在泼墨山水画里，你从墨色深处被隐去，天青色等烟雨 ，而我在等你，炊烟袅袅升起 ，隔江千万里，在瓶底书汉隶仿前朝的飘逸，就当我为遇见你伏笔，天色等烟雨 ，而我在等你，月色被打捞起， 晕开了结局，如传世的青花瓷自顾自美丽，你眼带笑意，天青色等烟雨 ，而我在等你，炊烟袅袅升起 ，隔江千万里，在瓶底书汉隶仿前朝的飘逸，就当我为遇见你伏笔，天青色等烟雨， 而我在等你，月色被打捞起 ，晕开了结局，如传世的青花瓷自顾自美丽，你眼带笑意。'),(42,'2024-03-30 14:49:02','理想三旬','雨后有车驶来，驶过暮色苍白，旧铁皮往南开，恋人已不在，收听浓烟下的，诗歌电台，不动情的咳嗽，至少看起来，归途也还可爱，琴弦少了姿态，再不见那夜里，听歌的小孩，时光匆匆独白，将颠沛磨成卡带，已枯倦的情怀，踏碎成年代，就老去吧，孤独别醒来，你渴望的离开，只是无处停摆，就歌唱吧，眼睛眯起来，而热泪的崩坏，只是没抵达的存在','file/newsPicture2.jpg','雨后有车驶来，驶过暮色苍白，旧铁皮往南开，恋人已不在，收听浓烟下的，诗歌电台，不动情的咳嗽，至少看起来，归途也还可爱，琴弦少了姿态，再不见那夜里，听歌的小孩，时光匆匆独白，将颠沛磨成卡带，已枯倦的情怀，踏碎成年代，就老去吧，孤独别醒来，你渴望的离开，只是无处停摆，就歌唱吧，眼睛眯起来，而热泪的崩坏，只是没抵达的存在，青春又醉倒在，籍籍无名的怀，靠嬉笑来虚度，聚散得慷慨，辗转却去不到，对的站台，如果漂泊是成长，必经的路牌，你迷醒岁月中，那贫瘠的未来，像遗憾季节里，未结果的爱，弄脏了每一页诗，吻最疼痛的告白，而风声吹到这，已不需要释怀，就老去吧，孤独别醒来，渴望的离开只是无处停摆就歌唱吧，眼睛眯起来而热泪的崩坏，只是没抵达的存在，就甜蜜地忍耐，繁星润湿窗台，光影跳动着像在，困倦里说爱，再无谓的感慨，以为明白，梦倒塌的地方，今已爬满青苔。'),(43,'2024-03-30 14:49:02','七里香','窗外的麻雀在电线杆上多嘴，你说这一句很有夏天的感觉，手中的铅笔在纸上来来回回，我用几行字形容你是我的谁，秋刀鱼的滋味猫跟你都想了解，初恋的香味就这样被我们寻回，那温暖的阳光像刚摘的鲜艳草莓，你说你舍不得吃掉这一种感觉，雨下整夜我的爱溢出就像雨水，院子落叶跟我的思念厚厚一叠','file/newsPicture3.jpg','窗外的麻雀在电线杆上多嘴，你说这一句很有夏天的感觉，手中的铅笔在纸上来来回回，我用几行字形容你是我的谁，秋刀鱼的滋味猫跟你都想了解，初恋的香味就这样被我们寻回，那温暖的阳光像刚摘的鲜艳草莓，你说你舍不得吃掉这一种感觉，雨下整夜我的爱溢出就像雨水，院子落叶跟我的思念厚厚一叠，几句是非也无法将我的热情冷却，你出现在我诗的每一页，雨下整夜我的爱溢出就像雨水，窗台蝴蝶像诗里纷飞的美丽章节，我接着写，把永远爱你写进诗的结尾，你是我唯一想要的了解，雨下整夜我的爱溢出就像雨水，院子落叶跟我的思念厚厚一叠，几句是非也无法将我的热情冷却，你出现在我诗的每一页，那饱满的稻穗幸福了这个季节，而你的脸颊像田里熟透的番茄，你突然对我说七里香的名字很美，我此刻却只想亲吻你倔强的嘴，雨下整夜我的爱溢出就像雨水，院子落叶跟我的思念厚厚一叠，几句是非也无法将我的热情冷却，你出现在我诗的每一页，整夜我的爱溢出就像雨水，窗台蝴蝶像诗里纷飞的美丽章节，我接着写，把永远爱你写进诗的结尾，是我唯一想要的了解。'),(44,'2024-03-30 14:49:02','江南','风到这里就是粘，粘住过客的思念，雨到了这里缠成线，缠着我们流连人世间，你在身边就是缘，缘分写在三生石上面，爱有万分之一甜，宁愿我就葬在这一点，圈圈圆圆圈圈，天天年年天天的我，深深看你的脸，生气的温柔，埋怨的温柔的脸','file/newsPicture4.jpg','风到这里就是粘，粘住过客的思念，雨到了这里缠成线，缠着我们流连人世间，你在身边就是缘，缘分写在三生石上面，爱有万分之一甜，宁愿我就葬在这一点，圈圈圆圆圈圈，天天年年天天的我，深深看你的脸，生气的温柔，埋怨的温柔的脸，不懂爱恨情愁煎熬的我们，都以为相爱就像风云的善变，相信爱一天抵过永远，在这一刹那冻结了时间，不懂怎么表现温柔的我们，还以为殉情只是古老的传言，离愁能有多痛痛有多浓，当梦被埋在江南烟雨中，心碎了才懂，圈圈圆圆圈圈，天天年年天天的我，深深看你的脸，生气的温柔，埋怨的温柔的脸，不懂爱恨情愁煎熬的我们，都以为相爱就像风云的善变，相信爱一天 抵过永远，在这一刹那冻结了时间，不懂怎么表现温柔的我们，还以为殉情只是古老的传言，离愁能有多痛 痛有多浓，当梦被埋在江南烟雨中，心碎了才懂，相信爱一天抵过永远。在这一刹那冻结了时间，不懂怎么表现温柔的我们，还以为殉情只是古老的传言，离愁能有多痛 痛有多浓，当梦被埋在江南烟雨中，心碎了才懂。'),(45,'2024-03-30 14:49:02','那些你很冒险的梦','当两颗心开始震动，当你瞳孔学会闪躲，当爱慢慢被遮住只剩下黑，距离像影子被拉拖，当爱的故事剩听说，我找不到你单纯的面孔，当生命每分每秒都为你转动，心多执着就加倍心痛，那些你很冒险的梦， 我陪你去疯，折纸飞机碰到雨天终究会坠落','file/newsPicture5.jpg','当两颗心开始震动，当你瞳孔学会闪躲，当爱慢慢被遮住只剩下黑，距离像影子被拉拖，当爱的故事剩听说，我找不到你单纯的面孔，当生命每分每秒都为你转动，心多执着就加倍心痛，那些你很冒险的梦， 我陪你去疯，折纸飞机碰到雨天终究会坠落，太残忍的话我直说 因为爱很重，你却不想懂 只往反方向走，当爱的故事剩听说，我找不到你单纯的面孔，当生命每分每秒都为你转动，心有多执着就加倍心痛，那些你很冒险的梦 我陪你去疯，折纸飞机 碰到雨天 终究会坠落，太残忍的话我直说 因为爱很重，你却不想懂 只往反方向走，我不想放手 你松开的左手，你爱的放纵 我白不回天空，我输了 累了，但你再也 不回头，那些你很冒险的梦 我陪你去疯，折纸飞机 碰到雨天 终究会坠落，太残忍的话我直说 因为爱很重，你却不想懂 只往反方向走，你真的不懂 我的爱已降落。'),(46,'2024-03-30 14:49:02','孤勇者','都，是勇敢的，你额头的伤口 你的 不同 你犯的错，都 不必隐藏，你破旧的玩偶 你的 面具 你的自我，他们说 要带着光 驯服每一头怪兽，他们说 要缝好你的伤，没有人爱小丑 为何孤独 不可 光荣，人只有不完美 值得歌颂，谁说污泥满身的不算英雄，爱你孤身走暗巷，爱你不跪的模样，爱你对峙过绝望','file/newsPicture6.jpg','都，是勇敢的，你额头的伤口 你的 不同 你犯的错，都 不必隐藏，你破旧的玩偶 你的 面具 你的自我，他们说 要带着光 驯服每一头怪兽，他们说 要缝好你的伤，没有人爱小丑 为何孤独 不可 光荣，人只有不完美 值得歌颂，谁说污泥满身的不算英雄，爱你孤身走暗巷，爱你不跪的模样，爱你对峙过绝望，不肯哭一场，爱你破烂的衣裳，却敢堵命运的枪，爱你和我那么像，缺口都一样，去吗 配吗 这褴褛的披风，战吗 战啊 以最卑微的梦，致那黑夜中的呜咽与怒吼，谁说站在光里的才算英雄，他们说 要戒了你的狂，就像擦掉了污垢，他们说 要顺台阶而上，而代价是低头，那就让我 不可 乘风，你一样骄傲着 那种孤勇，谁说对弈平凡的不算英雄，爱你孤身走暗巷 爱你不跪的模样，爱你对峙过绝望 不肯哭一场，爱你破烂的衣裳 却敢堵命运的枪，爱你和我那么像 缺口都一样，去吗 配吗 这褴褛的披风，战吗 战啊 以最卑微的梦，致那黑夜中的呜咽与怒吼，谁说站在光里的才算英雄，你的斑驳 与众不同 与众不同，你的沉默 震耳欲聋 震耳欲聋，You Are The Hero，爱你孤身走暗巷 爱你不跪的模样，爱你对峙过绝望 不肯哭一场，爱你来自于蛮荒 一生不借谁的光，你将造你的城邦 在废墟之上，去吗 去啊 以最卑微的梦，战吗 战啊 以最孤高的梦，致那黑夜中的呜咽与怒吼，谁说站在光里的才算英雄。');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) DEFAULT NULL COMMENT 'refid',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext NOT NULL COMMENT '图片',
  `type` varchar(200) DEFAULT NULL COMMENT '类型(1:收藏,21:赞,22:踩,31:竞拍参与,41:关注)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='我的收藏';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `username` varchar(200) NOT NULL COMMENT '用户名',
  `password` varchar(200) NOT NULL COMMENT '密码',
  `role` varchar(200) DEFAULT NULL COMMENT '角色',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='管理员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'2024-03-30 14:49:02','admin','admin','管理员');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yingyangdengjibiaozhun`
--

DROP TABLE IF EXISTS `yingyangdengjibiaozhun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yingyangdengjibiaozhun` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dengjimingcheng` varchar(200) DEFAULT NULL COMMENT '等级名称',
  `biaozhunmingcheng` varchar(200) DEFAULT NULL COMMENT '标准名称',
  `tupian` longtext COMMENT '图片',
  `biaozhunshuoming` longtext COMMENT '标准说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='营养等级标准';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yingyangdengjibiaozhun`
--

LOCK TABLES `yingyangdengjibiaozhun` WRITE;
/*!40000 ALTER TABLE `yingyangdengjibiaozhun` DISABLE KEYS */;
INSERT INTO `yingyangdengjibiaozhun` VALUES (101,'2024-03-30 14:49:02','等级名称1','标准名称1','file/yingyangdengjibiaozhunTupian1.jpg,file/yingyangdengjibiaozhunTupian2.jpg,file/yingyangdengjibiaozhunTupian3.jpg','标准说明1'),(102,'2024-03-30 14:49:02','等级名称2','标准名称2','file/yingyangdengjibiaozhunTupian2.jpg,file/yingyangdengjibiaozhunTupian3.jpg,file/yingyangdengjibiaozhunTupian4.jpg','标准说明2'),(103,'2024-03-30 14:49:02','等级名称3','标准名称3','file/yingyangdengjibiaozhunTupian3.jpg,file/yingyangdengjibiaozhunTupian4.jpg,file/yingyangdengjibiaozhunTupian5.jpg','标准说明3'),(104,'2024-03-30 14:49:02','等级名称4','标准名称4','file/yingyangdengjibiaozhunTupian4.jpg,file/yingyangdengjibiaozhunTupian5.jpg,file/yingyangdengjibiaozhunTupian6.jpg','标准说明4'),(105,'2024-03-30 14:49:02','等级名称5','标准名称5','file/yingyangdengjibiaozhunTupian5.jpg,file/yingyangdengjibiaozhunTupian6.jpg,file/yingyangdengjibiaozhunTupian7.jpg','标准说明5'),(106,'2024-03-30 14:49:02','等级名称6','标准名称6','file/yingyangdengjibiaozhunTupian6.jpg,file/yingyangdengjibiaozhunTupian7.jpg,file/yingyangdengjibiaozhunTupian8.jpg','标准说明6');
/*!40000 ALTER TABLE `yingyangdengjibiaozhun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yingyangjibie`
--

DROP TABLE IF EXISTS `yingyangjibie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yingyangjibie` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yingyangjibie` varchar(200) DEFAULT NULL COMMENT '营养级别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='营养级别';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yingyangjibie`
--

LOCK TABLES `yingyangjibie` WRITE;
/*!40000 ALTER TABLE `yingyangjibie` DISABLE KEYS */;
INSERT INTO `yingyangjibie` VALUES (51,'2024-03-30 14:49:02','营养级别1'),(52,'2024-03-30 14:49:02','营养级别2'),(53,'2024-03-30 14:49:02','营养级别3'),(54,'2024-03-30 14:49:02','营养级别4'),(55,'2024-03-30 14:49:02','营养级别5'),(56,'2024-03-30 14:49:02','营养级别6');
/*!40000 ALTER TABLE `yingyangjibie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yonghuming` varchar(200) NOT NULL COMMENT '用户名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` longtext COMMENT '头像',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `yingyangjibie` varchar(200) DEFAULT NULL COMMENT '偏好',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (31,'2024-03-30 14:49:02','用户账号1','123456','用户名1','男','file/yonghuTouxiang1.jpg','19819881111','偏好1'),(32,'2024-03-30 14:49:02','用户账号2','123456','用户名2','男','file/yonghuTouxiang2.jpg','19819881112','偏好2'),(33,'2024-03-30 14:49:02','用户账号3','123456','用户名3','男','file/yonghuTouxiang3.jpg','19819881113','偏好3'),(34,'2024-03-30 14:49:02','用户账号4','123456','用户名4','男','file/yonghuTouxiang4.jpg','19819881114','偏好4'),(35,'2024-03-30 14:49:02','用户账号5','123456','用户名5','男','file/yonghuTouxiang5.jpg','19819881115','偏好5'),(36,'2024-03-30 14:49:02','用户账号6','123456','用户名6','男','file/yonghuTouxiang6.jpg','19819881116','偏好6');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-04 15:20:29

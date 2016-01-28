/*
Navicat MySQL Data Transfer

Source Server         : mysqldb
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : permission

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2015-12-03 16:12:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for code_library
-- ----------------------------
DROP TABLE IF EXISTS `code_library`;
CREATE TABLE `code_library` (
  `id` varchar(35) NOT NULL,
  `codeNo` varchar(20) NOT NULL COMMENT '字典编号',
  `codeName` varchar(40) DEFAULT NULL COMMENT '字典名称',
  `itemNo` varchar(10) DEFAULT NULL COMMENT '子项值',
  `itemName` varchar(30) DEFAULT NULL COMMENT '子项名称',
  `dono` varchar(20) DEFAULT NULL COMMENT '域编号',
  `doName` varchar(40) DEFAULT NULL COMMENT '域名称',
  `describe` varchar(100) DEFAULT NULL COMMENT '描述',
  `status` varchar(2) DEFAULT NULL COMMENT '状态，见字典 codeStatus',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典信息表';

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `id` varchar(35) NOT NULL COMMENT 'id',
  `orgId` varchar(20) NOT NULL COMMENT '企业ID',
  `companyCode` varchar(20) NOT NULL COMMENT '企业编号，企业简称',
  `companyName` varchar(60) DEFAULT NULL COMMENT '企业名称，全称',
  `url` varchar(120) DEFAULT NULL COMMENT '链接url',
  `registeTime` datetime DEFAULT NULL COMMENT '注册本平台时间',
  `status` varchar(3) DEFAULT NULL COMMENT '状态，见字典 orgStatus',
  PRIMARY KEY (`id`),
  KEY `orgId` (`orgId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业信息表';

-- ----------------------------
-- Table structure for company_detail
-- ----------------------------
DROP TABLE IF EXISTS `company_detail`;
CREATE TABLE `company_detail` (
  `id` varchar(35) NOT NULL COMMENT 'id',
  `companyId` varchar(20) NOT NULL COMMENT '企业ID',
  `companyName` varchar(60) DEFAULT NULL COMMENT '企业名称',
  `companyEnglishName` varchar(60) DEFAULT NULL COMMENT '英文名称，全称',
  `companyCertType` varchar(2) DEFAULT NULL COMMENT '企业证件类型，见字典 companyCertType',
  `companyCertNo` varchar(30) DEFAULT NULL COMMENT '企业证件号码',
  `telphoneNo` varchar(30) DEFAULT NULL COMMENT '企业联系电话',
  `address` varchar(100) DEFAULT NULL COMMENT '企业地址',
  `email` varchar(30) DEFAULT NULL COMMENT '企业邮箱',
  `fox` varchar(20) DEFAULT NULL COMMENT '企业传真',
  `legalName` varchar(10) DEFAULT NULL COMMENT '法人代表名称',
  `legalCertType` varchar(2) DEFAULT NULL COMMENT '法人证件类型，见字典 personCertType',
  `legalCertNo` varchar(30) DEFAULT NULL COMMENT '法人证件号码',
  `legalMobileNo` varchar(30) DEFAULT NULL COMMENT '法人联系方式(手机)',
  `registeTime` datetime DEFAULT NULL COMMENT '注册时间',
  `country` varchar(4) DEFAULT NULL COMMENT '所属国别，见字典 country',
  `ndustryType` varchar(4) DEFAULT NULL COMMENT '所属行业，见字典 industryType',
  `scaleLevel` varchar(2) DEFAULT NULL COMMENT '规模等级，见字典 scaleLevel',
  `orgNature` varchar(4) DEFAULT NULL COMMENT '企业性质，见字典 orgNature ',
  `orgAuthlevel` varchar(3) DEFAULT NULL COMMENT '企业认证等级，见字典 orgAuthlevel',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `attribute1` varchar(20) DEFAULT NULL COMMENT '备用字段1',
  `attribute2` varchar(20) DEFAULT NULL COMMENT '备用字段2',
  `attribute3` varchar(20) DEFAULT NULL COMMENT '备用字段3',
  PRIMARY KEY (`id`),
  KEY `orgDetail_orgid` (`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业详细信息表';

-- ----------------------------
-- Table structure for log_info
-- ----------------------------
DROP TABLE IF EXISTS `log_info`;
CREATE TABLE `log_info` (
  `id` varchar(35) NOT NULL,
  `message` varchar(256) DEFAULT NULL COMMENT '日志内容',
  `operate` varchar(10) DEFAULT NULL COMMENT '操作',
  `createTime` datetime DEFAULT NULL COMMENT '创建日期',
  `ipAddress` varchar(16) DEFAULT NULL COMMENT 'IP地址',
  `logLevel` varchar(16) DEFAULT NULL COMMENT '日志级别',
  `userId` varchar(20) DEFAULT NULL COMMENT '操作用户ID',
  `userName` varchar(60) DEFAULT NULL COMMENT '操作用户名称',
  `companyId` varchar(20) DEFAULT NULL COMMENT '企业ID',
  `companyName` varchar(60) DEFAULT NULL COMMENT '企业名称',
  `systemId` varchar(20) DEFAULT NULL COMMENT '系统ID',
  `systemName` varchar(60) DEFAULT NULL COMMENT '系统名称',
  `url` varchar(200) DEFAULT NULL COMMENT 'url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for organization
-- ----------------------------
DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization` (
  `id` varchar(35) NOT NULL,
  `organizationId` varchar(20) DEFAULT NULL COMMENT '组织或部门ID',
  `organizationName` varchar(50) DEFAULT NULL COMMENT '组织或部门名称',
  `organizationType` varchar(4) DEFAULT NULL COMMENT '组织或部门类型，见字典 organizationType',
  `companyId` varchar(20) DEFAULT NULL COMMENT '所属企业ID',
  `parentOrganizationId` varchar(20) DEFAULT NULL COMMENT '上级组织或部门ID',
  `status` varchar(2) DEFAULT NULL COMMENT '状态，见字典 organizationStatus',
  `describe` varchar(100) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`),
  KEY `organizationID` (`organizationId`),
  KEY `organization_orgid` (`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='组织部门表';

-- ----------------------------
-- Table structure for organization_detail
-- ----------------------------
DROP TABLE IF EXISTS `organization_detail`;
CREATE TABLE `organization_detail` (
  `id` varchar(35) NOT NULL,
  `organizationId` varchar(20) NOT NULL COMMENT '组织或部门ID',
  `managerUserId` varchar(20) DEFAULT NULL COMMENT '组织或部门负责人',
  PRIMARY KEY (`id`),
  KEY `organizationDetail_organizationid` (`organizationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='组织或部门详细信息表';

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` varchar(35) NOT NULL COMMENT '主键',
  `permissionId` varchar(20) DEFAULT NULL COMMENT '权限id',
  `systemId` varchar(20) DEFAULT NULL COMMENT '系统id',
  `resourceType` varchar(4) DEFAULT NULL COMMENT '资源类型',
  `resourceId` varchar(20) DEFAULT NULL COMMENT '资源id',
  `operate` varchar(10) DEFAULT NULL COMMENT '操作',
  `describe` varchar(100) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` varchar(35) NOT NULL,
  `roleId` varchar(20) NOT NULL COMMENT '角色ID',
  `roleName` varchar(30) DEFAULT NULL COMMENT '角色名称',
  `roleDesc` varchar(50) DEFAULT NULL COMMENT '角色描述',
  `companyId` varchar(20) DEFAULT NULL COMMENT '所属企业ID',
  `status` varchar(2) DEFAULT NULL COMMENT '状态，见字典 roleStatus',
  PRIMARY KEY (`id`),
  KEY `roleId` (`roleId`),
  KEY `role_orgid` (`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Table structure for role_organization
-- ----------------------------
DROP TABLE IF EXISTS `role_organization`;
CREATE TABLE `role_organization` (
  `id` varchar(35) NOT NULL,
  `organizationId` varchar(20) NOT NULL COMMENT '组织或部门ID',
  `roleId` varchar(20) NOT NULL COMMENT '角色ID',
  `describe` varchar(100) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`),
  KEY `roleorganization_organizationid` (`organizationId`),
  KEY `organization_roleid` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='组织或部门与角色关联表';

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `id` varchar(35) NOT NULL,
  `roleId` varchar(20) DEFAULT NULL COMMENT '角色ID',
  `permissionId` varchar(20) DEFAULT NULL COMMENT '描述',
  `describe` varchar(100) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`),
  KEY `permission_roleid` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Table structure for structure
-- ----------------------------
DROP TABLE IF EXISTS `structure`;
CREATE TABLE `structure` (
  `id` varchar(35) NOT NULL,
  `structureId` varchar(20) DEFAULT NULL COMMENT '节点ID',
  `structureName` varchar(30) DEFAULT NULL COMMENT '节点名称',
  `describe` varchar(100) DEFAULT NULL COMMENT '描述',
  `url` varchar(100) DEFAULT NULL COMMENT 'url',
  `parentStructureId` varchar(20) DEFAULT NULL COMMENT '上级节点ID',
  `systemId` varchar(20) DEFAULT NULL COMMENT '所属系统ID',
  `isLeaf` varchar(2) DEFAULT NULL COMMENT '是否叶子节点，见字典 yesOrNo',
  `status` varchar(2) DEFAULT NULL COMMENT '状态，见字典 menuStatus',
  `sn` varchar(20) DEFAULT NULL COMMENT '模块代码',
  `priority` varchar(5) DEFAULT NULL COMMENT '优先级',
  PRIMARY KEY (`id`),
  KEY `menu_systermid` (`systemId`),
  KEY `menuId` (`structureId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单信息表';

-- ----------------------------
-- Table structure for system_info
-- ----------------------------
DROP TABLE IF EXISTS `system_info`;
CREATE TABLE `system_info` (
  `id` varchar(35) NOT NULL,
  `systemId` varchar(20) NOT NULL COMMENT '系统ID',
  `systemName` varchar(40) DEFAULT NULL COMMENT '系统名称，中文全称',
  `shortName` varchar(20) DEFAULT NULL COMMENT '中文简称',
  `englishName` varchar(40) DEFAULT NULL COMMENT '英文全称',
  `engShortName` varchar(20) DEFAULT NULL COMMENT '英文简称',
  `systemType` varchar(3) DEFAULT NULL COMMENT '系统类型，见字典 systermType',
  `url` varchar(60) DEFAULT NULL COMMENT '链接url',
  `registeTime` datetime DEFAULT NULL COMMENT '注册时间',
  `status` varchar(2) DEFAULT NULL COMMENT '状态，见字典 systermStatus',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `systemId` (`systemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统表';

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(35) NOT NULL,
  `userId` varchar(30) NOT NULL COMMENT '用户ID',
  `userLoginName` varchar(30) DEFAULT NULL COMMENT '用户登录名',
  `password` varchar(60) DEFAULT NULL COMMENT '登录密码',
  `companyId` varchar(30) DEFAULT NULL COMMENT '所属企业ID',
  `orgnizationId` varchar(30) DEFAULT NULL COMMENT '所属组织或部门ID',
  `status` varchar(2) DEFAULT NULL COMMENT '状态，见字典 userStatus',
  `salt` varchar(32) DEFAULT NULL COMMENT '密码(cookie存)',
  PRIMARY KEY (`id`),
  KEY `userId` (`userId`),
  KEY `userinfo_orgid` (`companyId`),
  KEY `userinfo_companyid` (`orgnizationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Table structure for user_detail
-- ----------------------------
DROP TABLE IF EXISTS `user_detail`;
CREATE TABLE `user_detail` (
  `id` varchar(35) NOT NULL,
  `userId` varchar(20) NOT NULL COMMENT '用户ID',
  `userName` varchar(20) DEFAULT NULL COMMENT '用户名',
  `certType` varchar(2) DEFAULT NULL COMMENT '证件类型，见字典 personCertType',
  `certNo` varchar(30) DEFAULT NULL COMMENT '证件号码',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别，见字典 sex',
  `birthday` varchar(10) DEFAULT NULL COMMENT '生日',
  `phoneNo` varchar(20) DEFAULT NULL COMMENT '电话号码，手机',
  `telPhoneNo` varchar(20) DEFAULT NULL COMMENT '联系电话，座机',
  `email` varchar(50) DEFAULT NULL COMMENT 'email',
  `address` varchar(100) DEFAULT NULL COMMENT '地址',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `userDetail_userid` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户详细信息表';

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` varchar(35) NOT NULL,
  `userId` varchar(20) DEFAULT NULL COMMENT '用户ID',
  `roleId` varchar(20) DEFAULT NULL COMMENT '角色ID',
  `status` varchar(2) DEFAULT NULL COMMENT '状态，见字典 userRoleStatus',
  PRIMARY KEY (`id`),
  KEY `userRole_userid` (`userId`),
  KEY `userRole_roleid` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关联表';

-- ----------------------------
-- Table structure for widget
-- ----------------------------
DROP TABLE IF EXISTS `widget`;
CREATE TABLE `widget` (
  `id` varchar(35) NOT NULL,
  `widgetId` varchar(20) NOT NULL COMMENT '控件ID',
  `widgetName` varchar(20) DEFAULT NULL COMMENT '控件名称',
  `widgetType` varchar(2) DEFAULT NULL COMMENT '控件类型，见字典 widgetType',
  `systemId` varchar(20) DEFAULT NULL COMMENT '所属系统ID',
  `structureId` varchar(20) DEFAULT NULL COMMENT '所属菜单ID',
  `parentWidgetId` varchar(20) DEFAULT NULL COMMENT '上级控件ID',
  `angModelId` varchar(20) DEFAULT NULL COMMENT 'AngularJS模型ID',
  `bindEvent` varchar(60) DEFAULT NULL COMMENT '绑定的事件声明',
  `priority` varchar(10) DEFAULT NULL COMMENT '优先级',
  PRIMARY KEY (`id`),
  KEY `widget_systermid` (`systemId`),
  KEY `widget_structrueid` (`structureId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='控件信息表';

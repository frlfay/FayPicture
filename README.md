# 智能云图库项目
## 项目介绍
基于 Vue 3 + Spring Boot + COS + AI 的 **企业级智能云图库平台**。

目前已完成功能：

1）所有用户都可以在平台公开上传和检索图片素材，快速找到需要的图片。可用作表情包网站、设计素材网站、壁纸网站等：![](/Users/suer/Library/Application Support/CleanShot/media/media_8AZqs6PAJ7/CleanShot 2025-04-07 at 22.46.19@2x.png)![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039257745-c3b0f4de-e3c0-4f6c-9853-ed3e37b09656.png)

以图搜图：

![](/Users/suer/Library/Application Support/CleanShot/media/media_926yjdDaOw/CleanShot 2025-04-07 at 22.33.05@2x.png)![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039288010-8aa08c87-5379-4645-8f6c-731f33a67841.png)

分享：

![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039302566-35237b6e-0caf-4d61-ae04-d884cbf743a3.png)

创建图片：

![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039312213-73014bb1-2b6c-4643-8b08-8665fbc6e174.png)

![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039362948-7f6a4682-dd5e-42d7-a404-77be4737d43f.png)

![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039382499-45b80260-598c-4dbd-b2a9-1bc6517aea37.png)

编辑图片：

![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039417832-2ced4821-5e15-4eeb-ac38-617231276238.png)

AI 扩图：

![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039429437-ff497fdf-8a8e-4c45-9f66-ab809da74374.png)

![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039437149-7237a66c-3850-43b6-aa09-7844e0246338.png)

创建成功后等待管理员审核：

![](/Users/suer/Library/Application Support/CleanShot/media/media_ZsEIK87X4Y/CleanShot 2025-04-07 at 22.27.18@2x.png)![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039446422-fcce864f-bad2-4bba-a830-8a4a219e0550.png)

管理员这边：

![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039450529-7e896f8e-7d37-44eb-9ed2-69c698bcab1e.png)![](/Users/suer/Library/Application Support/CleanShot/media/media_mpBQLP9r6F/CleanShot 2025-04-07 at 22.29.17@2x.png)

2）管理员可以上传、审核和管理图片，并对系统内的图片进行分析：

用户管理：

![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039456800-b6c56fc1-4286-4910-8c77-47f4b6d8d181.png)

图片管理：

![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039477739-ef2cd677-44d3-4cda-ad27-180cd93f50e8.png)

空间管理：

![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039485139-6a532863-e21c-4a38-9d5e-49cfd7673f50.png)

公共图库分析：

![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039491773-114ec397-9e1c-4cfc-ac66-05925dff7121.png)

空间分析：

![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039499992-d0f250eb-ea7f-4e34-9936-a5c8be0e1443.png)

3）对于个人用户，可将图片上传至私有空间进行批量管理、检索、编辑和分析，可用作个人网盘、个人相册、作品集等：

![](/Users/suer/Library/Application Support/CleanShot/media/media_s1JClxSizC/CleanShot 2025-04-07 at 22.07.43@2x.png)![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039511373-f7334c5b-0f81-40dc-9993-615ada5ba1e0.png)

搜索：

![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039515152-e060dfd5-8954-4455-bc18-da45b7f94165.png)

批量编辑：

![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039531811-1663ecff-02c7-4333-b67d-3e56a1fc8f53.png)![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039544529-09999350-b68c-48af-8bd1-22eb4bdad891.png)![](/Users/suer/Library/Application Support/CleanShot/media/media_Hvv3kXY6XY/CleanShot 2025-04-07 at 22.19.12@2x.png)私人空间分析：

![](/Users/suer/Library/Application Support/CleanShot/media/media_Id2iQzabTi/CleanShot 2025-04-07 at 22.20.26@2x.png)![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039558472-a25ae5b2-cf78-49b3-b8b8-94b3bb83f479.png)

## 核心业务流程：
![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039570159-4f4263ba-6e67-43e8-a4c2-9d62015d47a6.png)![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039577403-a2f4722b-129a-42e2-8a8b-73f5c6cc7e68.png)![](/Users/suer/Library/Application Support/CleanShot/media/media_W1qk8rBdsW/CleanShot 2025-04-07 at 23.16.46@2x.png)![](/Users/suer/Library/Application Support/CleanShot/media/media_OuH0YsxJld/CleanShot 2025-04-07 at 23.17.08@2x.png)

## 项目功能梳理：
#### 第一阶段：公共图库平台
用户模块 

+ 用户登录 
+ 用户注册 
+ 用户注销 
+ 用户权限控制 
+ 【管理员】管理用户

图片模块 

+ 【管理员】上传创建图片
+ 【管理员】图片信息编辑（标签/分类等）
+ 【管理员】管理图片 • 查看和搜索图片列表 
+ 查看图片详情（进入图片详情页）
+ 图片下载 
+ 用户上传创建图片 
+ 【管理员】审核图片 
+ 导入图片 
    - 通过 URL 导入图片 
    - 【管理员】批量抓取和创建图片
+ 【优化】图片查询优化- 分布式缓存、本地缓存、多级缓存 
+ 【优化】图片上传优化- 压缩、秒传、分片上传、断点续传 
+ 【优化】图片加载优化-懒加载、缩略图、CDN 加速、浏览器缓存 
+ 【优化】图片存储优化-降频存储（冷热数据分离）、清理策略

#### 第二阶段：用户私有图库
空间模块 

+ 【管理员】管理空间 
+ 用户开通私有空间 
+ 私有空间权限控制 
+ 空间级别和限额控制  
+ 空间图库分析 
    - 用户空间图库分析 
    - 【管理员】全空间分析

图片模块  

+ 图片搜索：基础属性搜索、以图搜图、颜色搜索 
+ 图片分享：链接分享、扫码分享 
+ 图片批量管理：批量修改信息、批量重命名 
+ 图片编辑：基础图片编辑、Al 图片编辑

## 目前项目架构设计图：
![](/Users/suer/Downloads/1732691889100-e562c709-cffa-477d-9329-1dc5ac1d35c8-20241204144304741-20241204145344935-20241204145354234.png)![](https://cdn.nlark.com/yuque/0/2025/png/54930720/1744039590067-735e7aca-1e01-4191-bf82-f9c3862a90ac.png)

## 技术选型
### 后端
+ Java Spring Boot 框架
+ MySQL 数据库 + MyBatis-Plus 框架 + MyBatis X 
+ Redis 分布式缓存 + Caffeine 本地缓存
+ Jsoup 数据抓取
+ ⭐️ COS 对象存储
+ ⭐️ AI 绘图大模型接入
+ ⭐️ 多种设计模式的运用
+ ⭐️ 多角度项目优化：性能、成本、安全性等

### 前端
+ Vue 3 框架
+ Vite 打包工具
+ Ant Design Vue 组件库
+ Axios 请求库
+ Pinia 全局状态管理
+ 其他组件：数据可视化、图片编辑等
+ ⭐️ 前端工程化：ESLint + Prettier + TypeScript
+ ⭐️ OpenAPI 前端代码生成


[1. IDEA对项目进行Git操作](#one)
### IDEA对项目进行Git操作<div id="one"></div>
    1. 可以通过git,在项目文件夹下创建一个init文件夹，然后就可以通过IDEA对项目进行管理。
    2. 然后可以通过IDEA顶部的VCS下的git,设定git的远程地址，以及对项目进行相关操作.

### 对于连接远程仓库，输入密码后出现异常问题
    这里一般输入的不是登录密码，需要去个人设置页面，获取到Token令牌，再将Token令牌作为密码输入，然后就能够连接远程仓库。

### Git的一般流程
    Git的Push和Pull一般是用于将本地项目提交和下载到本地。而Git clone则是把Github的内容下载到本地。Git Pull一般是将Github上的项目；拉取下来，
    然后和本地版本库进行合并，更新操作。
    一般将本地版本提交到Github上的流程是:
    1. git add . 将项目加入到本地版本库。
    2. git commit -m "提交说明"。
    3. git push 将本地版本提交到github仓库。
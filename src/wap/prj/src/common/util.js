export default {
  name: 'util',
  text () {
    console.log('测试，测试！！！')
  },
  showErr (msg) {
    alert(msg)
  },
  // 错误提示
  chkRes (res) {
    if (res.data.code > 0) {
      this.showErr(res.data.msg)
    }
    return res.data.code
  },
  // 登录成功，暂存token
  loginSuccess (res) {
    console.log(res.data.data)
    localStorage.setItem('userinfo', JSON.stringify(res.data.data))
    console.log(JSON.parse(localStorage.getItem('userinfo')))
  },
  // 检查未登录
  chkLogin (_vue) {
    var userinfo = JSON.parse(localStorage.getItem('userinfo'))
    if (userinfo === null) {
      _vue.$router.push('/Login')
    }
  }
}

export default {
  name: 'util',
  _vue: null,
  _vueins: null,
  install (vue) {
    this._vue = vue
  },
  setInstant (vueIns) {
    this._vueins = vueIns
  },
  showErr (msg) {
    this._vueins.$messagebox.alert(msg)
  },
  // 错误提示
  chkRes (res) {
    if (res.data.code > 0) {
      this.showErr(res.data.msg)
    }
    return res.data.code
  },
  // 登录成功，暂存token
  LoginSuccess (res) {
    console.log(res.data.data)
    localStorage.setItem('userinfo', JSON.stringify(res.data.data))
    console.log(JSON.parse(localStorage.getItem('userinfo')))
  },
  // 登录
  LoginOut () {
    localStorage.removeItem('userinfo')
  },
  // 获取本地用户信息
  GetUserInfo () {
    return JSON.parse(localStorage.getItem('userinfo'))
  },
  // 检查未登录
  chkLogin () {
    var userinfo = JSON.parse(localStorage.getItem('userinfo'))
    if (userinfo === null && location.href.search('/Login') < 1) {
      this._vueins.$router.push('/Login')
    }
  }
}

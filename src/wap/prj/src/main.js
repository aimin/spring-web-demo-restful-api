// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import Mint from 'mint-ui'
import 'mint-ui/lib/style.css'
import Util from './common/util.js'
// 引入axios，并加到原型链中
import axios from 'axios'
import QS from 'qs'

Vue.prototype.util = Util
Vue.prototype.$http = axios
Vue.prototype.qs = QS

Vue.prototype.$http.defaults.withCredentials = true
Vue.use(Mint)

Vue.config.productionTip = false
Vue.prototype.$baseUrl = process.env.baseUrl

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>',
  mounted: function () {
    // 检查未登录
    this.util.chkLogin(this)
  }
})

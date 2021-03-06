import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import './assets/css/global.css'
import ViewUI from 'view-design'
import 'view-design/dist/styles/iview.css'
import './assets/icon/iconfont.css'
import axios from 'axios'

import vuescroll from 'vuescroll'

import VueI18n from 'vue-i18n'

Vue.prototype.$axios = axios
axios.defaults.baseURL = 'http://120.26.60.194:8080'
// axios.defaults.withCredentials = true
// axios.interceptors.request.use(config => {
//   config.headers.token = window.localStorage.getItem('token')
//   return config
// })

Vue.use(VueI18n)

Vue.use(ViewUI)

Vue.use(vuescroll, {
  ops: {
    bar: {
      showDelay: 500,
      onlyShowBarOnScroll: true,
      keepShow: false,
      background: '#cecece',
      opacity: 0.5,
      hoverStyle: false,
      specifyBorderRadius: false,
      minSize: 0.2,
      size: '5px'
    }
  }, // 在这里设置全局默认配置
  name: 'myScroll' // 在这里自定义组件名字，默认是vueScroll
})

Vue.config.productionTip = false

// 多语言切换
const i18n = new VueI18n({
  locale: 'zh_cn', // 设置默认语言
  messages: {
    zh_cn: require('@/assets/lang/zh_cn'),
    en: require('@/assets/lang/en'),
    fr_FR: require('@/assets/lang/fr_FR'),
    ja_JP: require('@/assets/lang/ja_JP'),
    de_DE: require('@/assets/lang/de_DE')
  }
})

new Vue({
  router,
  i18n,
  store,
  render: h => h(App)
}).$mount('#app')

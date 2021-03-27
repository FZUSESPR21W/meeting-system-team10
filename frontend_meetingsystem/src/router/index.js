import Vue from 'vue'
import VueRouter from 'vue-router'

// 用户登录注册界面
import Index from '../views/index.vue'
import Login from '../components/index/login.vue'
import Register from '../components/index/register'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'index',
    component: Index,
    children: [
      {
        path: 'login',
        name: 'login',
        component: Login
      },
      {
        path: 'register',
        name: 'register',
        component: Register
      }
    ]
  }
]

const router = new VueRouter({
  routes
})

export default router

import Vue from 'vue'
import VueRouter from 'vue-router'

// 用户登录注册界面
import Index from '../views/index.vue'
import Login from '../components/index/login.vue'
import Register from '../components/index/register'

// 主席
import ChairmanIndex from '../views/index/chairmanIndex.vue'
import ViceChairmanIndex from '../views/index/viceChairmanIndex.vue'
import SecretaryIndex from '../views/index/secretaryIndex.vue'
import UserIndex from '../views/index/userIndex.vue'

// 分论坛主席

// 秘书

// 普通用户

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
  },
  // 主席
  {
    path: '/chairmanIndex',
    name: 'chairmanIndex',
    component: ChairmanIndex
  },
  // 分论坛主席
  {
    path: '/viceChairmanIndex',
    name: 'viceChairmanIndex',
    component: ViceChairmanIndex
  },
  // 秘书
  {
    path: '/secretaryIndex',
    name: 'secretaryIndex',
    component: SecretaryIndex
  },
  // 普通用户
  {
    path: '/userIndex',
    name: 'userIndex',
    component: UserIndex
  }
]

const router = new VueRouter({
  routes
})

export default router

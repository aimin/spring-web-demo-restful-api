import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Login from '@/views/Login'
import Home from '@/views/Home'
import Cluemg from '@/views/Cluemg'
import CluePost from '@/views/CluePost'

Vue.use(Router)
export default new Router({routes: [{
  path: '/',
  name: 'Home',
  component: Home
},
{
  path: '/Login',
  name: 'Login',
  component: Login
},
{
  path: '/Hello',
  name: 'Hello',
  component: HelloWorld
},
{
  path: '/Cluemg',
  name: 'Cluemg',
  component: Cluemg
},
{
  path: '/CluePost',
  name: 'CluePost',
  component: CluePost
}
]
})

import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import OwnerView from '../views/OwnerView.vue'
import PersonView from '../views/PersonView.vue'
import BaseEntityView from '../views/BaseEntityView.vue'
import VetView from '../views/VetView.vue'
import SpecialtyView from '../views/SpecialtyView.vue'
import PetView from '../views/PetView.vue'
import NamedEntityView from '../views/NamedEntityView.vue'
import PetTypeView from '../views/PetTypeView.vue'
import VisitView from '../views/VisitView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AboutView.vue')
    },
        {
      path: '/Owner',
      name: 'Owner',
      component: () => import('../views/OwnerView.vue')
    },
        {
      path: '/Person',
      name: 'Person',
      component: () => import('../views/PersonView.vue')
    },
        {
      path: '/BaseEntity',
      name: 'BaseEntity',
      component: () => import('../views/BaseEntityView.vue')
    },
        {
      path: '/Vet',
      name: 'Vet',
      component: () => import('../views/VetView.vue')
    },
        {
      path: '/Specialty',
      name: 'Specialty',
      component: () => import('../views/SpecialtyView.vue')
    },
        {
      path: '/Pet',
      name: 'Pet',
      component: () => import('../views/PetView.vue')
    },
        {
      path: '/NamedEntity',
      name: 'NamedEntity',
      component: () => import('../views/NamedEntityView.vue')
    },
        {
      path: '/PetType',
      name: 'PetType',
      component: () => import('../views/PetTypeView.vue')
    },
        {
      path: '/Visit',
      name: 'Visit',
      component: () => import('../views/VisitView.vue')
    },
      ]
})

export default router
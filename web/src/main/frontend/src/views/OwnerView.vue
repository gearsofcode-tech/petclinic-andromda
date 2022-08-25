<template>
  <div>
    <h1>Owner</h1>
    <table>
    <tr>
            <th>address</th>
            <th>telephone</th>
            <th>firstName</th>
            <th>lastName</th>
            <th>id</th>
          </tr>
    <tr v-for="entity in entities">
            <td>{{entity.address}}</td>
            <td>{{entity.telephone}}</td>
            <td>{{entity.firstName}}</td>
            <td>{{entity.lastName}}</td>
            <td>{{entity.id}}</td>
          </tr>
  </table>
  </div>
</template>

<script>
import { useOwnerStore } from '@/stores/OwnerStore.js'


export default{
  

    data() {
        const store = useOwnerStore();        
        return {
            entities: store.findAll
        }
    },

    mounted(){
        const store = useOwnerStore();        
        store.fetchAll();
    }
}
</script>

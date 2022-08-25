<template>
  <div>
    <h1>Vet</h1>
    <table>
    <tr>
            <th>firstName</th>
            <th>lastName</th>
            <th>id</th>
          </tr>
    <tr v-for="entity in entities">
            <td>{{entity.firstName}}</td>
            <td>{{entity.lastName}}</td>
            <td>{{entity.id}}</td>
          </tr>
  </table>
  </div>
</template>

<script>
import { useVetStore } from '@/stores/VetStore.js'


export default{
  

    data() {
        const store = useVetStore();        
        return {
            entities: store.findAll
        }
    },

    mounted(){
        const store = useVetStore();        
        store.fetchAll();
    }
}
</script>

<template>
  <div>
    <h1>PetType</h1>
    <table>
    <tr>
            <th>name</th>
            <th>id</th>
          </tr>
    <tr v-for="entity in entities">
            <td>{{entity.name}}</td>
            <td>{{entity.id}}</td>
          </tr>
  </table>
  </div>
</template>

<script>
import { usePetTypeStore } from '@/stores/PetTypeStore.js'


export default{
  

    data() {
        const store = usePetTypeStore();        
        return {
            entities: store.findAll
        }
    },

    mounted(){
        const store = usePetTypeStore();        
        store.fetchAll();
    }
}
</script>

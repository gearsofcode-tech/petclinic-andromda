<template>
  <div>
    <h1>Specialty</h1>
    <table>
    <tr>
            <th>id</th>
          </tr>
    <tr v-for="entity in entities">
            <td>{{entity.id}}</td>
          </tr>
  </table>
  </div>
</template>

<script>
import { useSpecialtyStore } from '@/stores/SpecialtyStore.js'


export default{
  

    data() {
        const store = useSpecialtyStore();        
        return {
            entities: store.findAll
        }
    },

    mounted(){
        const store = useSpecialtyStore();        
        store.fetchAll();
    }
}
</script>

<template>
  <div>
    <h1>PetType</h1>
    <table>
    <tr>
            <th>name</th>
            <th>id</th>
          </tr>
    <tr v-for="entity in entities">
            <td>name</td>
            <td>id</td>
          </tr>
  </table>
  </div>
</template>

<script>
export default{
  data() {
    return {
      entities: [{      name: 'name',
            id: 'id',
      }]
    }
  }
}
</script>
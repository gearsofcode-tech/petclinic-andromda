<template>
  <div>
    <h1>Pet</h1>
    <table>
    <tr>
            <th>birthDate</th>
            <th>name</th>
            <th>id</th>
          </tr>
    <tr v-for="entity in entities">
            <td>birthDate</td>
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
      entities: [{      birthDate: 'birthDate',
            name: 'name',
            id: 'id',
      }]
    }
  }
}
</script>
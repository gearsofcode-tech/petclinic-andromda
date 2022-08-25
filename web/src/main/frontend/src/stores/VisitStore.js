import { defineStore } from 'pinia'
import { baseAddress} from '@/components/BaseAddress.js'
import axios from "axios"


export const useVisitStore = defineStore('Visit', {
    state: () => ({ 
        entities: []
    }),

    getters: {
        findAll : (state) => state.entities,
    },

    actions: {
        async fetchAll(){
            try {
                const data = await axios.get(baseAddress() + 'Visit');
                console.log(data);
                this.entities = data.data;
            }
            catch (error) {
                alert(error)
                console.log(error)
            }
        }
    },

})

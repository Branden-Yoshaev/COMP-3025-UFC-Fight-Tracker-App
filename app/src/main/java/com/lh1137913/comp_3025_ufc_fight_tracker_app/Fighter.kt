package com.lh1137913.comp_3025_ufc_fight_tracker_app

data class Fighter (val name: String? = null, val hometown: String? = null, val nickname: String? = null, val record: String? = null,
                    val age: String? = null, val weightClass: String? = null, val fighterId: String? = null, val userId: String? = null) {
    override fun toString(): String {
        return if (name != null) {
            name!!
        } else {
            "Fighter does not exist"
        }
    }
}
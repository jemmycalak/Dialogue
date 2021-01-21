package jemmy.calak.dialogue.model

data class DialogueModel(
    var icon: Int,
    var title: String,
    var description: String,
    var titleButtonPositive: String,
    var titleButtonNegative: String?,
    var onPositive: (()->Unit)?,
    var onNegative: (()->Unit)?
)

package jemmy.calak.dialogue

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import jemmy.calak.dialogue.databinding.LayoutDialogBinding
import jemmy.calak.dialogue.model.DialogueModel

class Dialogue(val model: DialogueModel): DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        requireContext().let {
            val binding: LayoutDialogBinding = DataBindingUtil.inflate(LayoutInflater.from(it), R.layout.layout_dialog, null, false)
            binding.model = model
            binding.btnNegative.setOnClickListener {
                if (model.onNegative != null) {
                    model.onNegative?.invoke()
                }
                dismiss()
            }

            binding.btnPositive.setOnClickListener {
                if (model.onPositive != null) {
                    model.onPositive?.invoke()
                }
                dismiss()
            }

            val dialog = AlertDialog
                .Builder(requireContext())
                .setView(binding.root)
                .create()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

            return dialog
        }
    }
}

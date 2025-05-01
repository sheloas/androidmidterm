package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.button.MaterialButton

class SubmitLeaveDialog : BottomSheetDialogFragment() {

    interface SubmitLeaveListener {
        fun onSubmitConfirmed()
        fun onSubmitCancelled()
    }

    private var listener: SubmitLeaveListener? = null

    fun setSubmitLeaveListener(listener: SubmitLeaveListener) {
        this.listener = listener
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_submit_leave, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<MaterialButton>(R.id.btnSubmit).setOnClickListener {
            listener?.onSubmitConfirmed()
            dismiss()
        }

        view.findViewById<MaterialButton>(R.id.btnCheck).setOnClickListener {
            listener?.onSubmitCancelled()
            dismiss()
        }
    }

    companion object {
        const val TAG = "SubmitLeaveDialog"
    }
} 
package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton

class LeaveReviewFragment : Fragment(), SubmitLeaveDialog.SubmitLeaveListener {
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_leave_review, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<MaterialButton>(R.id.btnSubmitLeave).setOnClickListener {
            showSubmitDialog()
        }
    }

    private fun showSubmitDialog() {
        val dialog = SubmitLeaveDialog().apply {
            setSubmitLeaveListener(this@LeaveReviewFragment)
        }
        dialog.show(parentFragmentManager, SubmitLeaveDialog.TAG)
    }

    override fun onSubmitConfirmed() {
    }

    override fun onSubmitCancelled() {
    }
} 
package com.example.framepics

import android.os.Bundle
import com.zynksoftware.documentscanner.ScanActivity
import com.zynksoftware.documentscanner.model.DocumentScannerErrorModel
import com.zynksoftware.documentscanner.model.ScannerResults


class AppScanActivity: ScanActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_scan_activity_layout)
        addFragmentContentLayout()
    }

    override fun onError(error: DocumentScannerErrorModel) {

    }

    override fun onSuccess(scannerResults: ScannerResults) {

    }

    override fun onClose() {
        finish()
    }
}
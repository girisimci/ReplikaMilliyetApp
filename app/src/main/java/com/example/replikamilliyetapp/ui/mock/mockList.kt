package com.example.replikamilliyetapp.ui.mock

import com.example.replikamilliyetapp.ui.model.WriterModel

object mockList {
    fun getMockedWriterList(): List<WriterModel> {

        val writerModel = WriterModel(
            "fömas",
            "sait",
            "saitisik63@gmail.com",
            "Yazılım geleceğimiz"
        )
        val writerList: ArrayList<WriterModel> = ArrayList()

        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)
        writerList.add(writerModel)

        return writerList

    }
}
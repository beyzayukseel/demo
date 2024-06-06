package com.example.demo

import com.example.demo.datamodel.*
import com.example.demo.ddb.RepoHandler
import org.springframework.stereotype.Component

@Component
class Application(
    private val repoHandler: RepoHandler
) {

    fun processRecord(record: NewRecord) {
        when (record) {
            is CreateListingRecord -> repoHandler.decideRepo(record.repoType)?.createOrUpdateItem(record)
            is UpdateListingRecord -> repoHandler.decideRepo(record.repoType)?.createOrUpdateItem(record)
            is DeleteImageRecord -> repoHandler.decideRepo(record.repoType)?.deleteItem(record)
            is GetImageRecord -> repoHandler.decideRepo(record.repoType)?.getItem(record)
            else -> return
        }
    }
}
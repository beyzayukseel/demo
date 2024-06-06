package com.example.demo.datamodel

import com.example.demo.ddb.RepoName

sealed class NewRecord {
    abstract val repoType: RepoName
}

data class UpdateListingRecord(
    val list: List<String>,
): NewRecord() {
    override val repoType: RepoName = RepoName.LISTING
}

data class CreateListingRecord(
    val createRecord: Int
): NewRecord() {
    override val repoType: RepoName = RepoName.FINANCE
}

data class DeleteImageRecord(
    val createRecord: Int
): NewRecord() {
    override val repoType: RepoName = RepoName.FINANCE
}


data class DeleteLocationRecord(
    val createRecord: Int
): NewRecord() {
    override val repoType: RepoName = RepoName.FINANCE
}

data class GetImageRecord(
    val createRecord: Int
): NewRecord() {
    override val repoType: RepoName = RepoName.FINANCE
}
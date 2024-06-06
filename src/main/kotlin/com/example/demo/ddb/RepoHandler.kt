package com.example.demo.ddb

import org.springframework.stereotype.Component

@Component
class RepoHandler(
    private val repoList: List<BaseRepo>
) {

    fun decideRepo(repoName: RepoName): BaseRepo? {
        return repoList.firstOrNull { it.repoName == repoName }
    }
}
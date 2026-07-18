git status
On branch inspection-extra
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        history.md

nothing added to commit but untracked files present (use "git add" to track)
My answer: I am on branch [inspection-extra] and the working tree [is clean / has uncomitted changes]

git branch
 develop
* inspection-extra
  inspection-practice
  main
My Answer: The local branches that currently exist in my repository are: [main, develop , inspection-extra , inspection-practice].

git branch -r
origin/HEAD -> origin/main
origin/develop
origin/main
My Answer: The remote branches tracked by my repository are: [origin/main, origin/develop , origin/inspection-extra , origin/inspection-practice].

git branch -a
  develop
* inspection-extra
  inspection-practice
  main
  remotes/origin/HEAD -> origin/main
  remotes/origin/develop
  remotes/origin/main
My Answer: The -a flag lists all branches, which combines the outputs of the previous two commands to show both my local branches and the remote-tracking branches (prefixed with remotes/origin/).

git log --oneline
fc2e2ec (HEAD -> inspection-extra) add_extra_inspect
51a0514 (develop) add_inspection_practice
c7e42e6 (origin/develop, inspection-practice) Merge pull request #1 from amrutbagora-prog/main
f443639 (main) add_readme.md_with_introduction
65c213c Initial commit
My Answer: The recent commits on this branch include [briefly describe the last few commit messages, e.g., adding inspection notes or initial project setup].

git log --oneline --decorate --graph --all
* fc2e2ec (HEAD -> inspection-extra) add_extra_inspect
* 51a0514 (develop) add_inspection_practice
| *   750d365 (origin/main, origin/HEAD) Merge pull request #2 from amrutbagora-prog/develop
| |\
| |/
|/|
* | c7e42e6 (origin/develop, inspection-practice) Merge pull request #1 from amrutbagora-prog/main
|\|
| * f443639 (main) add_readme.md_with_introduction
|/
* 65c213c Initial commit
My Answer: The graph shows that [describe the relationship, e.g., inspection-extra branched off from develop, and both are currently ahead of main].

git diff develop..inspection-extra
diff --git a/inspection/extra.md b/inspection/extra.md
new file mode 100644
index 0000000..102e933
--- /dev/null
+++ b/inspection/extra.md
@@ -0,0 +1 @@
+## Extra Inspection Notes
My Answer: Compared to the develop branch, the inspection-extra branch includes [describe the added/modified files and text shown in the diff, e.g., the addition of the inspection/extra.md file and its contents].

git diff develop..inspection-practice
diff --git a/inspection/notes.md b/inspection/notes.md
deleted file mode 100644
index 167d432..0000000
--- a/inspection/notes.md
+++ /dev/null
@@ -1,3 +0,0 @@
-Learned how to create and switch branches
-practiced working with git commits
-understood how to inspect repo history
\ No newline at end of file
My Answer: Note: The prompt asks how it is different from inspection-extra, but the command diffs against develop. Based on the output, this branch differs by [describe the specific file changes or missing commits compared to the other branch].






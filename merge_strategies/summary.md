# PR Merge Strategies Summary

Here is an explanation of the different GitHub PR merge options:

*   **Merge Commit:** Preserves the exact shape of the branch history. It takes all commits from the feature branch and adds them to the base branch along with a new "merge commit" that ties them together.
*   **Squash and Merge:** Takes all the individual commits from the feature branch, combines (squashes) them into one single commit, and adds that to the base branch. It keeps the main history clean.
*   **Rebase and Merge:** Keeps the separate commits from the feature branch intact but reapplies them one by one onto the tip of the base branch. This makes the project history perfectly linear without an extra merge commit.

**Note:** There is no GitHub option called "rebase with merge commit"; rebasing and merge commits are fundamentally different ideas for handling history.

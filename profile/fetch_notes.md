## Fetch Notes
git fetch downloads commits, files, and branch updates from a remote repository to your local repository.
It updates your remote-tracking branches (like origin/develop) but does not automatically merge these changes into your current working branch.
It gives you a safe way to review what others have changed on the remote repository before you decide to integrate those changes into your local work.

## What Fetch Showed Me 

I compared my local branch with the remote branch using git diff. The fetch command showed me that a new bullet point was added on GitHub. The new line explains that git fetch is considered a "safe" operation because it will not overwrite or alter local files.
-It gives you a safe way to review what others have changed on the remote repository before you decide to integrate those changes into your local work.
+It gives you a safe way to review what others have changed on the remote repository before you decide to integrate those changes into your local work.
+git fetch is considered a "safe" operation because it will not overwrite or alter your local files.

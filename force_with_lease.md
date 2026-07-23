## Force With Lease Lab
This file will explain the force-with-lease command.
When we rebased the branch onto the latest origin/develop, the commit hashes changed. This happens because rebasing rewrites the commit history by creating brand new commits with new metadata and parent references, even if the file contents remain exactly the same.
A standard --force push blindly overwrites the remote branch's history with your local history. The --force-with-lease command is much safer because it first checks if the remote branch has new commits that you haven't fetched yet. If someone else has pushed updates to the remote branch in the meantime, --force-with-lease will reject your push, preventing you from accidentally destroying their work.

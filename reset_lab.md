Introduction to reset lab
Soft reset example details

## Reset Observations
Soft Reset (`git reset --soft`)**: Yeh HEAD pointer ko pichle commit par move karta hai, lekin aapke changes ko staging area (index) aur working directory mein safe rakhta hai.
Mixed Reset (`git reset --mixed`)**: Yeh Git ka default mode hai. Yeh HEAD ko peeche move karta hai aur changes ko unstage kar deta hai, lekin working directory mein changes maujood rehte hain.
Hard Reset (`git reset --hard`)**: Yeh sabse strict mode hai. Yeh HEAD ko move karne ke saath-saath staging area aur working directory se saare changes ko permanently delete kar deta hai.

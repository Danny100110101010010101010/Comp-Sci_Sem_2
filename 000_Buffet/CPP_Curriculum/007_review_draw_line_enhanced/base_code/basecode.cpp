// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"yeah we are starting c++"<<endl;
	for(int y = 1; y < 3; y++){
		for(int x = 1; x < 7; x++){
			gotoxy(x+5,y+4);
			cout <<"%";
		}
	}
}



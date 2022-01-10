// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"yeah we are starting c++"<<endl;
	for(int y = 1; y < 8; y++){
		for(int x = 1; x < 10; x++){
			gotoxy(x+6,y+6);
			cout <<"*";
		}
	}

}

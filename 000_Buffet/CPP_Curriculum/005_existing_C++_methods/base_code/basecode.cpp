// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char joe;
	char dave;
	int length;
	int i;
	cout<<"Please enter the symbol: ";
	cin>>joe;
	cout<<"Please enter line length: ";
	cin>> length;
	cout<<"horizontal, vertical or diagonal: ";
	cin>>dave;
	if(dave=='h'){
		for(i == 0; i < length; i++){
			cout<< joe;
		}
		
	}
	if(dave=='v'){
		for(i == 0; i < length; i++){
			cout<< joe<< endl;
		}
		
	}
	if(dave==('d')){
		for(i == 0; i < length; i++){
			gotoxy(6+i,7+i);
			cout<< joe<< endl;
		}
		
	}
}



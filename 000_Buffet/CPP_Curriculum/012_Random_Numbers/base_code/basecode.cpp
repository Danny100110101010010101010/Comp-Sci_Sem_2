// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	
	char lia;
	int a;
	int b;
	int c;
	cout<<"Please enter line length: ";
	cin>> a;
	cout<<"Please enter line symbol: ";
	cin>> lia;
	cout<<"Please enter line x coordinate: ";
	cin>>b;
	cout<<"Please enter line y coordinate: ";
	cin>>c;
	
	for(int i = 0; i < a; i++){
		gotoxy(b+i,c);
		cout<<lia;
	}
	
	

}

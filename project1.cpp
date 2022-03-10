#include<iostream>
using namespace std;
class students{
	string name;
	int id;
	public:
		students()
		{
			name="noname";
			id=0;
		}
		void set_value(string name,int id)
		{
			this->name=name;
			this->id=id;
		}
		friend istream&operator>>(istream&input,students&s)
		{
			cout<<"enter name:";
			input>>s.name;
			cout<<"enter id:";
			input>>s.id;
		}
		friend ostream&operator<<(ostream&output,students&s)
		{
			output<<"name:"<<s.name<<" id:"<<s.id<<"\n";
		}
};
int main()
{
	int n;
	cout<<"enter number of students:";
	cin>>n;
	students s[n];
	for(int i=0;i<n;i++)
	{
		cin>>s[i];
	}
	for(int i=0;i<n;i++)
	{
	     cout<<s[i];
	}
}

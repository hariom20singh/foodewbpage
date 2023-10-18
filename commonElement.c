#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node*next;
};

struct Node* createNode(int data){
    struct Node* temp=(struct Node*)malloc(sizeof(struct Node));
    temp->data=data;
    temp->next=NULL;
    return temp;
}

void display(struct Node *head){
    struct Node *temp=head;
    while(temp!=NULL){
        printf("%d ",temp->data);
        temp=temp->next;
    }
    printf("\n");
}

void common(struct Node *pt1,struct Node *pt2){
    struct Node *ptr1=pt1;
    struct Node *ptr2=pt2;
    while(ptr1!=NULL){
        while(ptr2!=NULL){
            if(ptr2->data==ptr1->data){
                printf("%d ",ptr1->data);
                ptr1=ptr1->next;
                ptr2=ptr2->next;
            }
            else{
                ptr2=ptr2->next;
            }
        }
        ptr2=pt2;
        ptr1=ptr1->next;
    }
}

int main(){
    
    struct Node *ptr1=NULL;
    struct Node *first=createNode(10);
    struct Node *second=createNode(20);
    struct Node *third=createNode(30);
    struct Node *fourth=createNode(40);

    ptr1=first;
    first->next=second;
    second->next=third;
    third->next=fourth;
    fourth->next=NULL;

    struct Node *ptr2=NULL;
    struct Node *one=createNode(10);
    struct Node *two=createNode(20);
    struct Node *three=createNode(30);

    ptr2=one;
    one->next=two;
    two->next=three;
    three->next=NULL;

    display(ptr1);
    display(ptr2);

    common(ptr1,ptr2);

    return 0;
}

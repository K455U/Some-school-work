#include <stdio.h>

int given;
void leap_year(int year);
int main(void)
{
    printf("Give year: ");
    scanf("%d",&given);
    leap_year(given);
}

void leap_year(int a)
{
    if (a % 400==0)
    {
        printf("Year is a leap year.");
    }
    else if (a % 100==0)
    {
        printf("Year is not a leap year.");
    }
    else if (a % 4==0)
    {
        printf("Year is a leap year.");
    }
    else
    {
        printf("Year is not a leap year");
    }
}
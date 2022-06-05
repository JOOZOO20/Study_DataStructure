// 이진 탐색 트리를 사용한 영어사전
/*
C언어로 쉽게 풀어쓴 자료구조 책을 통하여 예제를 실습해봄.
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <memory.h>

#define MAX_WORD_SIZE 100
#define MAX_MEANING_SIZE 200

// 데이터 형식
typedef struct{
  char word[]

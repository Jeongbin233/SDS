from pandas.io.json import json_normalize
import pandas as pd
import requests

json_Url = 'https://kosis.kr/openapi/Param/statisticsParameterData.do?method=getList&apiKey=NTRhNDNjYTlkYWQ4YzljZGI0YzNkOGRmNzYzN2E3YTI=&itmId=T2+T3+T4+&objL1=ALL&objL2=ALL&objL3=&objL4=&objL5=&objL6=&objL7=&objL8=&format=sdmx&jsonVD=Y&type=DSD&orgId=101&tblId=DT_1B04005N&version=v2_1'
# 데이터 요청 정상여부 확인 <Response [200]> 결과값 = '요청 성공'
test = requests.get(json_Url)
test

# JSON데이터 가져오기
test_data = test.json()
test_data

# pandas 활용 데이터 형태 변환
df = pd.json_normalize(test_data)
df.head(1)
df

print(df)

# csv 형태로 저장하기
df.to_csv('test1.csv', encoding = 'cp949')

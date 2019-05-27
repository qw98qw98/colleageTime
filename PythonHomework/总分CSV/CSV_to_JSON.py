import json
with open("example_2.csv") as f:
    ls=[line.replace("\n","").split(",") for line in f]
    jsondic=[]
    for i in ls[1:]:
        jsondic.append(dict(zip(ls[0],i)))
    json.dump(jsondic,ensure_ascii=False,fp=open("example_3.json","w+"),sort_keys=True, indent=4, separators=(',', ': '))
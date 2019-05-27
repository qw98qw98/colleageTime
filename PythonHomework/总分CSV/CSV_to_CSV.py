with open("example.csv") as f:
    ls=[line.replace("\n","").split(",") for line in f]
    ls[0].append("总分")
    for i in ls[1:]:
        i.append((str)(eval(f"{i[-1]}+{i[-2]}+{i[-3]}")))
with open("example_2.csv","w+") as f:
    for i in ls:
        f.write(",".join(i)+"\n")
def pattern_match(pattern, text):
    p_idx = 0
    t_idx = 0
    while p_idx < len(pattern) and t_idx < len(text):
        if pattern[p_idx] == text[t_idx]:
            p_idx += 1
            t_idx += 1
        else:
            p_idx = 0
            t_idx += 1
    return p_idx == len(pattern)
T = int(input())
for i in range(T):
    pattern = input().strip()
    text = input().strip()
    if pattern_match(pattern, text):
        print("YES")
    else:
        print("NO")
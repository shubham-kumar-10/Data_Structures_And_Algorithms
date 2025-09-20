
def longest_substring_k_distinct(s, k):
    window_start = 0
    max_length = 0
    char_frequency = {}

    for window_end in range(len(s)):
        right_char = s[window_end]
        char_frequency[right_char]=char_frequency.get(right_char, 0) + 1

        while len(char_frequency) > k:
            left_char = s[window_start]
            char_frequency[left_char] -= 1
            if char_frequency[left_char] == 0:
                del char_frequency[left_char]
            window_start += 1

        max_length = max(max_length, window_end - window_start + 1)

    return max_length

# TC:O(N)
# SC:O(26) => O(1) as we are using a fixed size hashmap

# Some other problems which are similar to this are :
# Longest subarray with ones after swapping at most k zeros    
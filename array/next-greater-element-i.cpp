class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int, int> nge_map;
        stack<int> st;
        for (int num : nums2) {
            while (!st.empty() && num > st.top()) {
                nge_map[st.top()] = num;
                st.pop();
            }
            st.push(num);
        }
        vector<int> result;
        result.reserve(nums1.size()); 
        for (int num : nums1) {
            if (nge_map.count(num)) {
                result.push_back(nge_map[num]);
            } else {
                result.push_back(-1);
            }
        }
        return result;
    }
};
int removeDuplicates(vector<int>& nums) {
    if(nums.empty())
        return 0;
    int n = 0;
    for(int i = 0; i < nums.size(); ++i){
        if(i == 0 || nums[i] != nums[i - 1]){
            nums[n++] = nums[i];
        }
    }
    return n;
    }

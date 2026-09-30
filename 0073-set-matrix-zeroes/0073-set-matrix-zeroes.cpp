class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        vector<int>v;
        vector<int>t;
        for(int i=0;i<matrix.size();i++){
            for(int x=0;x<matrix[0].size();x++){
                if(matrix[i][x]==0){
                   v.push_back(i);
                    t.push_back(x);
                }
            }
        }
        for(int k=0;k<matrix[0].size();k++){
        for(int i=0;i<v.size();i++){
            matrix[v[i]][k]=0;
        }
        }
        for(int k=0;k<matrix.size();k++){
        for(int i=0;i<t.size();i++){
            matrix[k][t[i]]=0;
        }
        }
        
    }
};
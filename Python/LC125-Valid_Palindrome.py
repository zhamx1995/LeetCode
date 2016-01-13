class Solution(object):
    def getAscii(self,ch):
        result = ord(ch)
        if result > 64 and result < 91:
            result += 32
        if (result < 48) or (result < 97 and result >=58) or result > 122:
            return -1
        else:
            return result
            
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s) == 0:
            return True;
        start = 0
        end = len(s)-1
        while start < end:
            while self.getAscii(s[start]) == -1 and start < end:
                start += 1
            while self.getAscii(s[end]) == -1 and end > start:
                end -= 1
            if self.getAscii(s[start]) != self.getAscii(s[end]):
                return False
            else:
                start += 1
                end -= 1
        return True
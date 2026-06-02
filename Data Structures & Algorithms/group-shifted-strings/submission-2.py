class Solution:
    def groupStrings(self, strings: List[str]) -> List[List[str]]:
        def get_sequence(string: str) -> List[str]:

            def get_next_ch(ch):
                if ch == 'z':
                    return 'a'
                return chr(ord(ch) + 1)

            def get_next_string(s):
                return ''.join([get_next_ch(ch) for ch in s])

            sequence = set()
            curr = string

            while curr not in sequence:
                sequence.add(curr)

                curr = get_next_string(curr)

            return sequence

        hash_map = collections.defaultdict(set)
        visited = set()

        for s in strings:
            if s in visited:
                continue

            seq = get_sequence(s)

            for string in seq:
                visited.add(string)

            hash_map[s] = seq

        sequences = []

        for seq in hash_map.values():
            sequences.append(seq)

        group_size = len(hash_map)
        groups = [[] for _ in range(group_size)]

        for s in strings:
            for i, seq in enumerate(sequences):
                if s in seq:
                    groups[i].append(s)

        return groups